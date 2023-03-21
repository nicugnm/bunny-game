package ro.pao.repository;

import ro.pao.model.enums.EggColor;
import ro.pao.model.Egg;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface EggRepository {

    Optional<Egg> getEggById(UUID id);

    Optional<Egg> getEggByColor(EggColor color);

    List<Egg> getAllEggs();

    void addEgg(Egg egg);

    void addEggs(List<Egg> eggs);
}
