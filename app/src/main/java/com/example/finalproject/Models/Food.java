package com.example.finalproject.Models;

public class Food {
    private int id;
    private String foodName;
    private String unit;
    private String image;
    private String description;
    private int type;
    public Food(){}
    public Food(String foodName, String unit, String image, String description, int type) {
        this.foodName = foodName;
        this.unit = unit;
        this.image = image;
        this.description = description;
        this.type = type;
    }
    public Food(int id, String foodName, String unit, String image, String description, int type) {
        this.id = id;
        this.foodName = foodName;
        this.unit = unit;
        this.image = image;
        this.description = description;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }
}
