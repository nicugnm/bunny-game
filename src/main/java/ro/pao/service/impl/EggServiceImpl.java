package ro.pao.service.impl;

import lombok.Getter;
import lombok.NoArgsConstructor;
import ro.pao.model.Egg;
import ro.pao.model.enums.EggColor;
import ro.pao.service.EggService;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@NoArgsConstructor
@Getter
public class EggServiceImpl implements EggService {

    private static final List<Egg> eggList = new ArrayList<>();

    private static final List<EggRecords> eggRecordsList = new ArrayList<>();

    @Override
    public Optional<Egg> getEggById(UUID id) {
        return Optional.empty();
    }

    @Override
    public Optional<Egg> getEggByColor(EggColor color) {
        return Optional.empty();
    }

    @Override
    public List<Egg> getAllEggs() {
        return eggList;
    }

    public List<EggRecords> getEggsRecord() {
        return eggRecordsList;
    }

    @Override
    public void addEggs(List<Egg> eggs) {
        eggList.addAll(eggs);
    }

    @Override
    public void addEgg(Egg egg) {
        eggList.add(egg);
    }

    public void addEggRecords() {
        eggRecordsList.add(new EggRecords(eggList));
    }
}
