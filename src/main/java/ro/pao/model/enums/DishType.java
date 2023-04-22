package ro.pao.model.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Arrays;

@AllArgsConstructor
@Getter
public enum DishType {
    PIE("pie"),
    CAKE("cake"),
    OMELETTE("omelette");

    private String type;

    public static DishType getEnumByType(final String type) {
        return Arrays.stream(DishType.values())
                .filter(dishType -> dishType.getType().equals(type))
                .findFirst()
                .orElse(CAKE);
    }
}
