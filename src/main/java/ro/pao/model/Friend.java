package ro.pao.model;

import lombok.Getter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;
import ro.pao.model.abstracts.AbstractEntity;

@SuperBuilder
@Getter
@ToString
public class Friend extends AbstractEntity {
    private String name;
    private String surname;
    private String email;
    private String address;
    private String phone;
}