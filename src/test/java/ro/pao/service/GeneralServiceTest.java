package ro.pao.service;

import org.junit.jupiter.api.Test;
import ro.pao.domain.model.Egg;
import ro.pao.domain.model.enums.EggColor;
import ro.pao.service.impl.EggServiceImpl;
import ro.pao.service.impl.GeneralServiceImpl;

import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

public class GeneralServiceTest {

    private final GeneralService generalService = new GeneralServiceImpl();
    private final EggService eggService = new EggServiceImpl();

    record EggsData(List<Egg> redColor, List<Egg> greenAndBrownColor) {
        EggsData {
            redColor = redColor == null ? List.of() : redColor;
            greenAndBrownColor = greenAndBrownColor == null ? List.of() : greenAndBrownColor;
        }
    }

    @Test
    void testAddEggsTask1() {
        generalService.addEggsTask1();

        assertEquals(5, eggService.getAllEggs().size());
    }

    @Test
    void whenGivenEggColor_thenFindColorIsSet() {
        generalService.colorEggsTask2();

        final EggsData eggsData = eggService.getAllEggs().stream()
                .collect(Collectors.teeing(
                        Collectors.filtering((Egg egg) -> "red".equals(egg.getColor().getType()), Collectors.toList()),
                        Collectors.filtering((Egg egg) -> "brown".equals(egg.getColor().getType()) ||
                                "green".equals(egg.getColor().getType()), Collectors.toList()),
                        EggsData::new
                ));

       assertTrue(eggsData.redColor.size() == 3);
       assertEquals(eggsData.greenAndBrownColor.stream()
               .filter(egg -> "green".equals(egg.getColor().getType()))
               .toList()
               .size(), eggsData.greenAndBrownColor.stream()
               .filter(egg -> "brown".equals(egg.getColor().getType()))
               .toList()
               .size());
    }

    @Test
    void whenGivenEggColor_thenCheckAllColors() {
        assertEquals(8, EggColor.values().length);
    }
}
