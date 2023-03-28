package ro.pao.model;

import ro.pao.model.abstracts.AbstractEntity;
import lombok.ToString;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@ToString
@Getter
@Setter
public abstract class Gift extends AbstractEntity {
    Friend sender;
    Friend receiver;
    Boolean isSent;
}