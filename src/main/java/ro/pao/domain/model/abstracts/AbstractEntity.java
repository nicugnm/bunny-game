package ro.pao.domain.model.abstracts;

import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.Date;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@ToString
@EqualsAndHashCode
public abstract class AbstractEntity {

    private UUID id;

    private Date creationDate;

    private Date updateDate;

    private Date deleteDate;
}
