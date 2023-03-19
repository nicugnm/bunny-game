package ro.pao.repository;

import ro.pao.domain.model.enums.EggColor;
import ro.pao.domain.model.Egg;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface EggRepository {

    Optional<Egg> getEggById(final UUID id);

    Optional<Egg> getEggByColor(final EggColor color);

    List<Egg> getAllEggs();

    void addEgg(final Egg egg);

    void addEggs(final List<Egg> eggs);
}
