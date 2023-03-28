package ro.pao.service;

import ro.pao.model.abstracts.Gift;

import java.util.List;

public interface GiftService {

    void addGift(Gift gift);

    public void addGifts(List<Gift> gifts);

    void removeGift(Gift gift);

    void changeGift(Gift oldGift, Gift newGift);

    void sendGiftBaskets();

    void exchangeGifts();
}
