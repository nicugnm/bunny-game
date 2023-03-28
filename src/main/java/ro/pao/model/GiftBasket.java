package ro.pao.model;

import lombok.ToString;
import lombok.experimental.SuperBuilder;
import java.util.List;

@SuperBuilder
@ToString
public final class GiftBasket extends Gift {
    private final List<Egg> eggs;
    private final List<Dish> dishes;
}
