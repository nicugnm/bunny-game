package ro.pao.service.impl;

import lombok.Getter;
import lombok.NoArgsConstructor;
import ro.pao.model.Dish;
import ro.pao.model.enums.DishType;
import ro.pao.service.DishService;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@NoArgsConstructor
@Getter
public class DishServiceImpl implements DishService {

    private static final List<Dish> dishList = new ArrayList<>();

    @Override
    public void addDishes(List<Dish> dishes) {
        dishList.addAll(dishes);
    }

    @Override
    public void addDish(Dish dish) {
        dishList.add(dish);
    }

    @Override
    public Optional<Dish> getDishById(UUID id) {
        return Optional.empty();
    }

    @Override
    public Optional<Dish> getDishbyType(DishType type) {
        return Optional.empty();
    }

    @Override
    public List<Dish> getAllDishes() {
        return dishList;
    }

    @Override
    public void updateDish(Dish dish1, Dish dish2) {
        dishList.remove(dish1);
        dishList.add(dish2);
    }

    @Override
    public void deleteDish(Dish dish) {
        dishList.remove(dish);
    }
}
