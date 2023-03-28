package ro.pao.model;

import lombok.ToString;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@ToString
public final class GiftFriend extends Gift {
    private Egg egg;
    private String message;
}