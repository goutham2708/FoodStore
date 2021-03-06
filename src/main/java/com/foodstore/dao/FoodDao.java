package com.foodstore.dao;

import com.foodstore.entity.Food;

import java.util.List;

public interface FoodDao {

    public Food createFood(Food food);
    public Food updateFood(Food food);
    public void deleteFood(Long foodId);
    public Food findOne(Long foodId);
    public List<Food> findAll();
}
