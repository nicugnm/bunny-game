package ro.pao.service.impl;

import lombok.Getter;
import lombok.NoArgsConstructor;
import ro.pao.model.enums.EggColor;
import ro.pao.model.Egg;
import ro.pao.service.EggService;
import ro.pao.repository.EggRepository;
import ro.pao.repository.impl.EggRepositoryImpl;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@NoArgsConstructor
@Getter
public class EggServiceImpl implements EggService {

    private final EggRepository eggRepository = new EggRepositoryImpl();

    @Override
    public Optional<Egg> getEggById(UUID id) {
        return eggRepository.getEggById(id);
    }

    @Override
    public Optional<Egg> getEggByColor(EggColor color) {
        return Optional.empty();
    }

    @Override
    public List<Egg> getAllEggs() {
        return eggRepository.getAllEggs();
    }

    @Override
    public void addEggs(List<Egg> eggs) {
        eggRepository.addEggs(eggs);
    }
}
