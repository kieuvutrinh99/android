package com.example.kieuvutrinh_appbtl;

import java.io.Serializable;

public class Food implements Serializable {
    private int img_food;
    private String name_Food;

    public Food(int img_food, String name_Food) {
        this.img_food = img_food;
        this.name_Food = name_Food;
    }

    public int getImg_food() {
        return img_food;
    }

    public void setImg_food(int img_food) {
        this.img_food = img_food;
    }

    public String getName_Food() {
        return name_Food;
    }

    public void setName_Food(String name_Food) {
        this.name_Food = name_Food;
    }
}
