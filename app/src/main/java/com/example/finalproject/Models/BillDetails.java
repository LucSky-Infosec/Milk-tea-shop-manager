package com.example.finalproject.Models;


public class BillDetails {
    private int billID ;
    private int sizeID ;
    private int foodID ;
    private int amount;
    private double price ;

    public BillDetails(int billID,  int foodID,int sizeID, int amount, double price) {
        this.billID = billID;
        this.foodID = foodID;
        this.sizeID = sizeID;
        this.amount = amount;
        this.price = price;
    }
    public BillDetails( int foodID, int sizeID, int amount, double price) {
        this.foodID = foodID;
        this.sizeID = sizeID;
        this.amount = amount;
        this.price = price;
    }

    public BillDetails() {
    }

    public int getBillID() {
        return billID;
    }

    public void setBillID(int billID) {
        this.billID = billID;
    }

    public int getSizeID() {
        return sizeID;
    }

    public void setSizeID(int sizeID) {
        this.sizeID = sizeID;
    }

    public int getFoodID() {
        return foodID;
    }

    public void setFoodID(int foodID) {
        this.foodID = foodID;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    @Override
    public String toString() {
        return "BillDetails{" + "billID=" + billID + ", sizeID=" + sizeID + ", foodID=" + foodID + ", amount=" + amount + ", price=" + price + '}';
    }
}