package ro.pao.service;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ro.pao.application.Menu;
import ro.pao.model.Egg;
import ro.pao.model.enums.EggColor;
import ro.pao.service.impl.DishServiceImpl;
import ro.pao.service.impl.EggServiceImpl;
import ro.pao.service.impl.FriendServiceImpl;
import ro.pao.service.impl.GiftServiceImpl;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

class GeneralServiceTest {

    private final Menu menu = Menu.getInstance();
    private final EggService eggService = new EggServiceImpl();

    private final DishService dishService = new DishServiceImpl();

    private final GiftService giftService = new GiftServiceImpl();

    private final FriendService friendService = new FriendServiceImpl();

    private final PrintStream stdOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @Test
    void givenSystemOutRedirection_whenInvokePrintln_thenOutputCaptorSuccess() {
        System.out.println("Test!");

        assertEquals("Test!", outputStreamCaptor.toString()
                                                        .trim());
    }

    @AfterEach
    public void tearDown() {
        System.setOut(stdOut);
    }

    @Test
    void testAddEggsTask1() {
        menu.addEggsTask1();

        assertEquals(5, eggService.getAllEggs().size());
    }

    @Test
    void whenGivenEggColor_thenFindColorIsSet() {
        menu.colorEggsTask2();

        final EggsData eggsData = eggService.getAllEggs().stream()
                .collect(Collectors.teeing(
                        Collectors.filtering((Egg egg) -> EggColor.RED.equals(egg.getColor()), Collectors.toList()),
                        Collectors.filtering((Egg egg) -> EggColor.BROWN.equals(egg.getColor()) ||
                                EggColor.GREEN.equals(egg.getColor()), Collectors.toList()),
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

    record EggsData(List<Egg> redColor, List<Egg> greenAndBrownColor) {
        EggsData {
            redColor = redColor == null ? List.of() : redColor;
            greenAndBrownColor = greenAndBrownColor == null ? List.of() : greenAndBrownColor;
        }
    }

    @Test
    void testSummarizeEggsTask6() {
        menu.summarizeEggsTask6();
        String red = "RED=3";
        String green = "GREEN=2";
        String brown = "BROWN=2";
        String none = "NONE=5";
        assertTrue(outputStreamCaptor.toString()
                                     .trim()
                                     .contains(red) &&
                outputStreamCaptor.toString()
                                  .trim()
                                  .contains(green) &&
                outputStreamCaptor.toString()
                                  .trim()
                                  .contains(brown) &&
                outputStreamCaptor.toString()
                                  .trim()
                                  .contains(none));

    }

    @Test
    void testAddDishesTask10() {
        menu.addDishesTask10();
        assertEquals(3, dishService.getAllDishes().size());
    }

    @Test
    void testAddFriendsTask10() {
        menu.addFriendsTask10();
        assertEquals(6, friendService.getAllFriends().size());
    }
}
