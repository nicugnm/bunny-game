package ro.pao.domain.model;

import lombok.Getter;
import lombok.experimental.SuperBuilder;
import ro.pao.domain.model.abstracts.AbstractEntity;
import ro.pao.domain.model.enums.EggColor;

@SuperBuilder
@Getter
public class Egg extends AbstractEntity {

    private EggColor color;
}
