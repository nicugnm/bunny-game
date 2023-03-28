package ro.pao.service.impl;

import lombok.NoArgsConstructor;
import ro.pao.model.GiftBasket;
import ro.pao.model.GiftCard;
import ro.pao.model.GiftFriend;
import ro.pao.model.abstracts.Gift;
import ro.pao.service.GiftService;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.UnaryOperator;

@NoArgsConstructor
public class GiftServiceImpl implements GiftService {
    private static final List<Gift> giftList = new ArrayList<>();

    public void addGift(Gift gift) {
        giftList.add(gift);
    }

    public void addGifts(List<Gift> gifts) {
        giftList.addAll(gifts);
    }

    public void removeGift(Gift gift) {
        giftList.remove(gift);
    }

    public void changeGift(Gift oldGift, Gift newGift) {
        removeGift(oldGift);
        addGift(newGift);
    }

    public void sendGiftBaskets() {
        giftList.forEach(gift -> {
            if (gift instanceof GiftBasket) {
                gift.setIsSent(true);
            }
        });
    }

    public void exchangeGifts() {
        List<GiftCard> giftCards = giftList.stream()
                .filter(gift -> gift instanceof GiftCard)
                .map(gift -> (GiftCard) gift)
                .toList();
        List<GiftFriend> giftFriends = giftList.stream()
                .filter(gift -> gift instanceof GiftFriend)
                .map(gift -> (GiftFriend) gift)
                .toList();

        UnaryOperator<GiftCard> sendUnary = giftCard -> {
            giftCard.setIsSent(true);
            return giftCard;
        };

        UnaryOperator<GiftCard> respondUnary = giftCard -> {
            giftFriends.stream()
                    .filter(gift -> gift.getReceiver().equals(giftCard.getSender()))
                    .findFirst()
                    .get()
                    .setIsSent(true);
            return giftCard;
        };

        Function<GiftCard, GiftCard> exchange = sendUnary.andThen(respondUnary);

        giftCards.forEach(exchange::apply);
    }
}