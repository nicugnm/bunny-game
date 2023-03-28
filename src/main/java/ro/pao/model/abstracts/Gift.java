package ro.pao.model.abstracts;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;
import ro.pao.model.Friend;

@SuperBuilder
@ToString
@Getter
@Setter
public abstract class Gift extends AbstractEntity {
    Friend sender;
    Friend receiver;
    Boolean isSent;
}