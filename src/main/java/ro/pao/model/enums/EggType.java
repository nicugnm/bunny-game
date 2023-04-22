package ro.pao.model.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Arrays;

@AllArgsConstructor
@Getter
public enum EggType {
    CHICKEN("chicken"),
    QUAIL("quail"),
    DUCK("duck"),
    GOOSE("goose"),
    UNKNOWN("unknown");

    private String type;

    public static EggType getEnumByType(final String type) {
        return Arrays.stream(EggType.values())
                .filter(eggType -> eggType.getType().equals(type))
                .findFirst()
                .orElse(UNKNOWN);
    }
}