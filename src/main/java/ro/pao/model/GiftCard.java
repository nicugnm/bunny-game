package ro.pao.model;

import lombok.ToString;
import lombok.experimental.SuperBuilder;
import ro.pao.model.abstracts.Gift;

@SuperBuilder
@ToString
public final class GiftCard extends Gift {
    private String message;
}