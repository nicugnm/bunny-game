package ro.pao.application;

import ro.pao.model.Egg;
import ro.pao.model.enums.EggColor;
import ro.pao.service.EggService;
import ro.pao.service.impl.EggServiceImpl;

import java.time.Instant;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.UUID;

public class Menu {

    private final Random random = new Random();
    private final EggService eggService = new EggServiceImpl();

    private static Menu INSTANCE;

    public static Menu getInstance() {
        return (INSTANCE == null ? new Menu() : INSTANCE);
    }

    //private final EggService eggService = new EggServiceImpl();

    //TODO TASK 1: Adauga 5 oua.
    public void addEggsTask1() {
        this.eggService.addEggs(List.of(Egg.builder()
                .id(UUID.randomUUID())
                .build(),
                Egg.builder()
                        .id(UUID.randomUUID())
                        .build()));
    }

    //TODO TASK2: Adauga 3 oua rosii. Am nevoie si de unele 'green' si 'brown'. Vreau ca numarul celor green si numarul celor brown sa fie egal!
    // Ai putea sa modifici fisierul de test in care sa compari enum-urile inloc de string-uri?
    public void colorEggsTask2() {

    }

    public void randomizeEggsTask() {
        var redNumber = random.nextInt();
        var greenNumber = random.nextInt();
        var brownNumber = random.nextInt();

        for (int i = 0; i < Math.max(Math.max(redNumber, greenNumber), brownNumber); i++) {
            if (i < redNumber) {
                eggService.addEggs(List.of(Egg.builder()
                        .id(UUID.randomUUID())
                        .creationDate(Date.from(Instant.now()))
                        .updateDate(Date.from(Instant.now()))
                        .color(EggColor.RED)
                        .build()));
            }
            if (i < greenNumber) {
                eggService.addEggs(List.of(Egg.builder()
                        .id(UUID.randomUUID())
                        .creationDate(Date.from(Instant.now()))
                        .updateDate(Date.from(Instant.now()))
                        .color(EggColor.getEnumByType("green"))
                        .build()));
            }
            if (i < brownNumber) {
                eggService.addEggs(List.of(Egg.builder()
                        .id(UUID.randomUUID())
                        .creationDate(Date.from(Instant.now()))
                        .updateDate(Date.from(Instant.now()))
                        .color(EggColor.getEnumByType("brown"))
                        .build()));
            }
        }
    }
}
