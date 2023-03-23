package ro.pao.application;

import ro.pao.model.Egg;
import ro.pao.model.Dish;
import ro.pao.model.Friend;
import ro.pao.model.enums.EggColor;
import ro.pao.model.enums.EggType;
import ro.pao.model.enums.DishType;
import ro.pao.service.EggService;
import ro.pao.service.impl.EggServiceImpl;
import ro.pao.service.DishService;
import ro.pao.service.impl.DishServiceImpl;
import ro.pao.service.FriendService;
import ro.pao.service.impl.FriendServiceImpl;

import java.time.Instant;
import java.util.*;
import java.util.stream.Collectors;

public class Menu {

    private final Random random = new Random();
    private final EggService eggService = new EggServiceImpl();
    private final FriendService friendService = new FriendServiceImpl();

    private static Menu INSTANCE;

    public static Menu getInstance() {
        return (INSTANCE == null ? new Menu() : INSTANCE);
    }

    //private final EggService eggService = new EggServiceImpl();

    //FINISHED TASK 1: Adauga 5 oua.
    public void addEggsTask1() {
        this.eggService.addEggs(List.of(
                Egg.builder()
                        .id(UUID.randomUUID())
                        .color(EggColor.NONE)
                        .type(EggType.UNKNOWN)
                        .creationDate(Date.from(Instant.now()))
                        .updateDate(Date.from(Instant.now()))
                        .deleteDate(Date.from(Instant.now()))
                        .build(),
                Egg.builder()
                        .id(UUID.randomUUID())
                        .color(EggColor.NONE)
                        .type(EggType.UNKNOWN)
                        .creationDate(Date.from(Instant.now()))
                        .updateDate(Date.from(Instant.now()))
                        .deleteDate(Date.from(Instant.now()))
                        .build(),
                Egg.builder()
                        .id(UUID.randomUUID())
                        .color(EggColor.NONE)
                        .type(EggType.UNKNOWN)
                        .creationDate(Date.from(Instant.now()))
                        .updateDate(Date.from(Instant.now()))
                        .deleteDate(Date.from(Instant.now()))
                        .build(),
                Egg.builder()
                        .id(UUID.randomUUID())
                        .color(EggColor.NONE)
                        .type(EggType.UNKNOWN)
                        .creationDate(Date.from(Instant.now()))
                        .updateDate(Date.from(Instant.now()))
                        .deleteDate(Date.from(Instant.now()))
                        .build(),
                Egg.builder()
                        .id(UUID.randomUUID())
                        .color(EggColor.NONE)
                        .type(EggType.UNKNOWN)
                        .creationDate(Date.from(Instant.now()))
                        .updateDate(Date.from(Instant.now()))
                        .deleteDate(Date.from(Instant.now()))
                        .build()
        ));
    }

    //FINISHED TASK2: Adauga 3 oua rosii. Am nevoie si de unele 'green' si 'brown'. Vreau ca numarul celor green si numarul celor brown sa fie egal!
    // Ai putea sa modifici fisierul de test in care sa compari enum-urile inloc de string-uri?
    public void colorEggsTask2() {
        this.eggService.addEggs(List.of(
                Egg.builder()
                        .id(UUID.randomUUID())
                        .color(EggColor.RED)
                        .type(EggType.CHICKEN)
                        .creationDate(Date.from(Instant.now()))
                        .updateDate(Date.from(Instant.now()))
                        .deleteDate(Date.from(Instant.now()))
                        .build(),
                Egg.builder()
                        .id(UUID.randomUUID())
                        .color(EggColor.RED)
                        .type(EggType.DUCK)
                        .creationDate(Date.from(Instant.now()))
                        .updateDate(Date.from(Instant.now()))
                        .deleteDate(Date.from(Instant.now()))
                        .build(),
                Egg.builder()
                        .id(UUID.randomUUID())
                        .color(EggColor.RED)
                        .type(EggType.QUAIL)
                        .creationDate(Date.from(Instant.now()))
                        .updateDate(Date.from(Instant.now()))
                        .deleteDate(Date.from(Instant.now()))
                        .build(),
                Egg.builder()
                        .id(UUID.randomUUID())
                        .color(EggColor.GREEN)
                        .type(EggType.CHICKEN)
                        .creationDate(Date.from(Instant.now()))
                        .updateDate(Date.from(Instant.now()))
                        .deleteDate(Date.from(Instant.now()))
                        .build(),
                Egg.builder()
                        .id(UUID.randomUUID())
                        .color(EggColor.BROWN)
                        .type(EggType.DUCK)
                        .creationDate(Date.from(Instant.now()))
                        .updateDate(Date.from(Instant.now()))
                        .deleteDate(Date.from(Instant.now()))
                        .build(),
                Egg.builder()
                        .id(UUID.randomUUID())
                        .color(EggColor.GREEN)
                        .type(EggType.QUAIL)
                        .creationDate(Date.from(Instant.now()))
                        .updateDate(Date.from(Instant.now()))
                        .deleteDate(Date.from(Instant.now()))
                        .build(),
                Egg.builder()
                        .id(UUID.randomUUID())
                        .color(EggColor.BROWN)
                        .type(EggType.GOOSE)
                        .creationDate(Date.from(Instant.now()))
                        .updateDate(Date.from(Instant.now()))
                        .deleteDate(Date.from(Instant.now()))
                        .build()
        ));
    }

    public void summarizeEggsTask6() {
        Map<EggColor, Long> colorGroups = this.eggService.getAllEggs()
                                                    .stream()
                                                    .collect(Collectors.groupingBy(Egg::getColor, Collectors.counting()));
        System.out.println(colorGroups);
    }

    public void recordEggsTask7() {
        eggService.addEggRecords();
    }

    public void partitionEggsTask8_1() {
        Map<Boolean, List<Egg>> knownTypePartition = this.eggService.getAllEggs()
                .stream()
                .collect(Collectors.partitioningBy(egg -> !EggType.UNKNOWN.equals(egg.getType())));
        System.out.println(knownTypePartition);
    }

    public void partitionEggsTask8_2() {
        Map<EggColor, List<Egg>> colorPartition = this.eggService.getAllEggs()
                .stream()
                .collect(Collectors.groupingBy(Egg::getColor, Collectors.toList()));
        System.out.println(colorPartition);
    }

    public void partitionEggsTask8_3() {
        //nu am stiut exact dupa ce sortam deci m am gandit ca as putea sa le sortez dupa culoare, alfabetic
        PriorityQueue<Egg> eggs = new PriorityQueue<>(new Comparator<Egg>() {
            @Override
            public int compare(Egg e1, Egg e2) {
                return e1.getColor().getType().compareTo(e2.getColor().getType());
            }
        });
        eggs.addAll(this.eggService.getAllEggs());
        System.out.println(eggs);
    }

    public void randomizeEggsTask() {
        //am setat un range mai mic pentru ca se generau numere extrem de mari si trebuia sa astept foarte mult la rulare
        var redNumber = random.nextInt(20);
        var greenNumber = random.nextInt(20);
        var brownNumber = random.nextInt(20);

        for (int i = 0; i < Math.max(Math.max(redNumber, greenNumber), brownNumber); i++) {
            if (i < redNumber) {
                eggService.addEggs(List.of(Egg.builder()
                        .id(UUID.randomUUID())
                        .creationDate(Date.from(Instant.now()))
                        .updateDate(Date.from(Instant.now()))
                        .color(EggColor.RED)
                        .type(EggType.UNKNOWN)
                        .build()));
            }
            if (i < greenNumber) {
                eggService.addEggs(List.of(Egg.builder()
                        .id(UUID.randomUUID())
                        .creationDate(Date.from(Instant.now()))
                        .updateDate(Date.from(Instant.now()))
                        .color(EggColor.getEnumByType("green"))
                        .type(EggType.UNKNOWN)
                        .build()));
            }
            if (i < brownNumber) {
                eggService.addEggs(List.of(Egg.builder()
                        .id(UUID.randomUUID())
                        .creationDate(Date.from(Instant.now()))
                        .updateDate(Date.from(Instant.now()))
                        .color(EggColor.getEnumByType("brown"))
                        .type(EggType.UNKNOWN)
                        .build()));
            }
        }
    }

    public void addFriendsTask10() {
        this.friendService.addFriends(List.of(
                Friend.builder()
                        .id(UUID.randomUUID())
                        .name("Ion")
                        .surname("Maria")
                        .email("email")
                        .phone("phone")
                        .build(),
                Friend.builder()
                        .id(UUID.randomUUID())
                        .name("Vasile")
                        .surname("Robert")
                        .email("email")
                        .address("address")
                        .phone("phone")
                        .build(),
                Friend.builder()
                        .id(UUID.randomUUID())
                        .name("Gheorghe")
                        .surname("Stefan")
                        .email("email")
                        .address("address")
                        .phone("phone")
                        .build(),
                Friend.builder()
                        .id(UUID.randomUUID())
                        .name("Mihai")
                        .surname("Andrei")
                        .email("email")
                        .address("address")
                        .phone("phone")
                        .build(),
                Friend.builder()
                        .id(UUID.randomUUID())
                        .name("Alexandru")
                        .surname("Calin")
                        .email("email")
                        .address("address")
                        .phone("phone")
                        .build()
        ));
    }

    public void showFriendsTask10() {
        List<Friend> friends = this.friendService.getAllFriends();
        friends.forEach(System.out::println);
    }
}
