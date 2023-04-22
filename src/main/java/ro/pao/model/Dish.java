package ro.pao.model;

import lombok.Getter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;
import ro.pao.model.abstracts.AbstractEntity;
import ro.pao.model.enums.DishType;

@SuperBuilder
@Getter
@ToString
public class Dish extends AbstractEntity {
    //categoria preparatului(ex: prajitura):
    private DishType type;
    //preparatul specific(ex: tiramisu):
    private String name;
}