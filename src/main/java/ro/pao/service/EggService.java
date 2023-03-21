package ro.pao.service;

import ro.pao.model.enums.EggColor;
import ro.pao.model.Egg;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface EggService {

    Optional<Egg> getEggById(UUID id);

    Optional<Egg> getEggByColor(EggColor color);

    List<Egg> getAllEggs();

    void addEggs(List<Egg> eggs);

    void addEgg(Egg egg);
}
