package com.example.kieuvutrinh_appbtl;

import java.io.Serializable;
import java.util.List;

public class Category implements Serializable {
    private String name_Category;
    private List<Food> foods;

    public Category(String name_Category, List<Food> foods) {
        this.name_Category = name_Category;
        this.foods = foods;
    }

    public String getName_Category() {
        return name_Category;
    }

    public void setName_Category(String name_Category) {
        this.name_Category = name_Category;
    }

    public List<Food> getFoods() {
        return foods;
    }

    public void setFoods(List<Food> foods) {
        this.foods = foods;
    }
}
