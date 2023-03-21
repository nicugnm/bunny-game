package ro.pao.repository.impl;

import ro.pao.model.enums.EggColor;
import ro.pao.model.Egg;
import ro.pao.repository.EggRepository;

import java.time.Instant;
import java.util.*;
import java.util.List;

public class EggRepositoryImpl implements EggRepository {

    private final List<Egg> eggs = new ArrayList<>();

    {
        this.eggs.add(Egg.builder()
                .id(UUID.randomUUID())
                .creationDate(Date.from(Instant.now()))
                .color(EggColor.NONE)
                .build());
    }

    @Override
    public Optional<Egg> getEggById(UUID id) {
        return this.eggs.stream()
                .filter(egg -> id.equals(egg.getId()))
                .findFirst();
    }

    @Override
    public Optional<Egg> getEggByColor(EggColor color) {
        return Optional.empty();
    }

    @Override
    public List<Egg> getAllEggs() {
        return this.eggs;
    }

    @Override
    public void addEgg(Egg egg) {
        this.eggs.add(egg);
    }

    @Override
    public void addEggs(List<Egg> eggs) {
        this.eggs.addAll(eggs);
    }
}
