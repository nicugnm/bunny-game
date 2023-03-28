package ro.pao.model;

import lombok.ToString;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@ToString
public final class GiftCard extends Gift {
    private String message;
}