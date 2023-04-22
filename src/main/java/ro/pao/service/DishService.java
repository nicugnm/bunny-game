package ro.pao.service;

import ro.pao.model.Dish;
import ro.pao.model.enums.DishType;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface DishService {
    //CREATE METHODS:
    void addDishes(List<Dish> dishes);

    void addDish(Dish dish);

    //READ METHODS:
    Optional<Dish> getDishById(UUID id);

    Optional<Dish> getDishbyType(DishType type);

    List<Dish> getAllDishes();

    //UPDATE METHODS:
    void updateDish(Dish dish1, Dish dish2);

    //DELETE METHODS:
    void deleteDish(Dish dish);
}
