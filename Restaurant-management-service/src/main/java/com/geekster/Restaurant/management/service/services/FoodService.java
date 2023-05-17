package com.geekster.Restaurant.management.service.services;

import com.geekster.Restaurant.management.service.moduls.Foods;
import com.geekster.Restaurant.management.service.moduls.Restaurant;
import com.geekster.Restaurant.management.service.repository.IFoodRepository;
import com.geekster.Restaurant.management.service.repository.IRestaurantRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FoodService {
    @Autowired
    private IFoodRepository iFoodRepository;
    @Autowired
    private IRestaurantRepository iRestaurant;

    public String addFood(Foods food) {
        iFoodRepository.save(food);
        return "Food added Successfully!!";
    }

    public String deleteFood(Long id) {
        iFoodRepository.deleteById(id);
        return "Food deleted Successfully!!";
    }
    @Transactional
    public String updateFoodById(Long id, Double price) {
        iFoodRepository.updateFoodById(id , price);
        return "Food updated Succesfully!!";
    }
}
