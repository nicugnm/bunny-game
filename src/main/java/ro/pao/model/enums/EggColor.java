package ro.pao.model.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Arrays;

@AllArgsConstructor
@Getter
public enum EggColor {
    RED("red"),
    BLACK("black"),
    YELLOW("yellow"),
    NONE("none");

    private String type;

    public static EggColor getEnumByType(final String type) {
        return Arrays.stream(EggColor.values())
                .filter(eggColor -> eggColor.getType().equals(type))
                .findFirst()
                .orElse(NONE);
    }
}
