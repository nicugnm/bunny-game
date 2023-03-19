package ro.pao.repository.impl;

import ro.pao.domain.model.enums.EggColor;
import ro.pao.domain.model.Egg;
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
    public Optional<Egg> getEggById(final UUID id) {
        return this.eggs.stream()
                .filter(egg -> id.equals(egg.getId()))
                .findFirst();
    }

    @Override
    public Optional<Egg> getEggByColor(final EggColor color) {
        return Optional.empty();
    }

    @Override
    public List<Egg> getAllEggs() {
        return this.eggs;
    }

    @Override
    public void addEgg(final Egg egg) {
        this.eggs.add(egg);
    }

    @Override
    public void addEggs(final List<Egg> eggs) {
        this.eggs.addAll(eggs);
    }
}
