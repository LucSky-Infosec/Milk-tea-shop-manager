package com.example.finalproject.Models;
import java.util.List;
import java.util.Date;
public class Bill {
    private int id ;
    private String paymentMethod ;
    private Date createdDate ;
    private double AmountOfMoney;
    private int promotionID ;
    private int staffID ;
    private int customerID ;
    private List<Integer> tableList;
    public Bill() {
    }
    public Bill(String paymentMethod, Date createdDate, double AmoutOfMoney, int promotionID, int staffID, int customerID) {
        this.paymentMethod = paymentMethod;
        this.createdDate = createdDate;
        this.AmountOfMoney = AmoutOfMoney;
        this.promotionID = promotionID;
        this.staffID = staffID;
        this.customerID = customerID;
    }
    public Bill(int id, String paymentMethod, Date createdDate, double AmoutOfMoney, int promotionID, int staffID, int customerID) {
        this.id = id;
        this.paymentMethod = paymentMethod;
        this.createdDate = createdDate;
        this.AmountOfMoney = AmoutOfMoney;
        this.promotionID = promotionID;
        this.staffID = staffID;
        this.customerID = customerID;
    }
    public Bill(String paymentMethod, Date createdDate, double AmoutOfMoney, int promotionID, int staffID, int customerID, List<Integer> tableList) {
        this.paymentMethod = paymentMethod;
        this.createdDate = createdDate;
        this.AmountOfMoney = AmoutOfMoney;
        this.promotionID = promotionID;
        this.staffID = staffID;
        this.customerID = customerID;
        this.tableList = tableList;
    }
    public Bill(int id, String paymentMethod, Date createdDate, double AmoutOfMoney, int promotionID, int staffID, int customerID, List<Integer> tableList) {
        this.id = id;
        this.paymentMethod = paymentMethod;
        this.createdDate = createdDate;
        this.AmountOfMoney = AmoutOfMoney;
        this.promotionID = promotionID;
        this.staffID = staffID;
        this.customerID = customerID;
        this.tableList = tableList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public Date getCreatedDate() {return createdDate;}

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public double getAmountOfMoney() {
        return AmountOfMoney;
    }

    public void setAmountOfMoney(double AmoutOfMoney) {
        this.AmountOfMoney = AmoutOfMoney;
    }

    public int getPromotionID() {
        return promotionID;
    }

    public void setPromotionID(int promotionID) {
        this.promotionID = promotionID;
    }

    public int getStaffID() {
        return staffID;
    }

    public void setStaffID(int staffID) {
        this.staffID = staffID;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public List<Integer> getTableList() {
        return tableList;
    }

    public void setTableList(List<Integer> tableList) {
        this.tableList = tableList;
    }
    @Override
    public String toString() {
        return "Bill{" +
                "id=" + id +
                ", paymentMethod='" + paymentMethod + '\'' +
                ", createdDate=" + createdDate +
                ", AmountOfMoney=" + AmountOfMoney +
                ", promotionID=" + promotionID +
                ", staffID='" + staffID + '\'' +
                ", customerID=" + customerID +
                '}';
    }
}
