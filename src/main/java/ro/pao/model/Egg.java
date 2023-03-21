package ro.pao.model;

import lombok.Getter;
import lombok.experimental.SuperBuilder;
import ro.pao.model.abstracts.AbstractEntity;
import ro.pao.model.enums.EggColor;

@SuperBuilder
@Getter
public class Egg extends AbstractEntity {

    private EggColor color;
}
