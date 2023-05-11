package com.example.finalproject.Models;
import java.util.Date;

public class Promotion {
    private int id;
    private Date startDate;
    private Date endDate;
    private int value;
    private String reason;

    public Promotion(){}
    public Promotion(Date startDate, Date endDate, int value, String reason) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.value = value;
        this.reason = reason;
    }
    public Promotion(int id, Date startDate, Date endDate, int value, String reason) {
        this.id = id;
        this.startDate = startDate;
        this.endDate = endDate;
        this.value = value;
        this.reason = reason;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }
}
