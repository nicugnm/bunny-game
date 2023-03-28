package ro.pao.service.impl;

import lombok.Getter;
import lombok.NoArgsConstructor;
import ro.pao.model.Friend;
import ro.pao.service.FriendService;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@NoArgsConstructor
@Getter
public class FriendServiceImpl implements FriendService {

    private static final List<Friend> friendList = new ArrayList<>();

    @Override
    public Optional<Friend> getFriendById(UUID id) {
        return Optional.empty();
    }

    @Override
    public Optional<Friend> getFriendBySurname(String surname) {
        return friendList.stream()
                .filter(friend -> friend.getSurname().equals(surname))
                .findFirst();
    }

    @Override
    public List<Friend> getAllFriends() {
        return friendList;
    }

    @Override
    public void addFriends(List<Friend> friends) {
        friendList.addAll(friends);
    }

    @Override
    public void addFriend(Friend friend) {
        friendList.add(friend);
    }
}
