package ro.pao.service.impl;

import lombok.Getter;
import lombok.NoArgsConstructor;
import ro.pao.domain.model.enums.EggColor;
import ro.pao.domain.model.Egg;
import ro.pao.repository.EggRepository;
import ro.pao.repository.impl.EggRepositoryImpl;
import ro.pao.service.EggService;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@NoArgsConstructor
@Getter
public class EggServiceImpl implements EggService {

    private final EggRepository eggRepository = new EggRepositoryImpl();

    @Override
    public Optional<Egg> getEggById(final UUID id) {
        return eggRepository.getEggById(id);
    }

    @Override
    public Optional<Egg> getEggByColor(final EggColor color) {
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
