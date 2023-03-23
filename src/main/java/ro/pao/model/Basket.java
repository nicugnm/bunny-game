package ro.pao.model;

import lombok.Getter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;
import ro.pao.model.abstracts.AbstractEntity;

import java.util.List;

@SuperBuilder
@Getter
@ToString
public final class Basket extends AbstractEntity {
    private List<Egg> eggs;
    private List<Dish> dishes;
}
