package com.example.finalproject.Models;

public class FoodDetails {
    private int foodID;
    private int sizeID;
    private int price;
    public FoodDetails() {
    }
    public FoodDetails(int foodID, int sizeID, int price) {
        this.foodID = foodID;
        this.sizeID = sizeID;
        this.price = price;
    }


    public int getFoodID() {
        return foodID;
    }

    public void setFoodID(int foodID) {
        this.foodID = foodID;
    }

    public int getSizeID() {
        return sizeID;
    }

    public void setSizeID(int sizeID) {
        this.sizeID = sizeID;
    }

    @Override
    public String toString() {
        return "FoodDetails{" + "foodID=" + foodID + ", sizeID=" + sizeID + ", price=" + price + '}';
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}