package com.example.finalproject.Models;

public class Account {
    private Integer id;
    private String username;
    private String password;
    private boolean status;
    private Integer staffID;

    public Account() {
    }
    public Account(String username, String password, boolean status, Integer staffID) {
        this.username = username;
        this.password = password;
        this.status = status;
        this.staffID = staffID;
    }
    public Account(Integer id, String username, String password, boolean status, Integer staffID) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.status = status;
        this.staffID = staffID;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Integer getStaffID() {
        return staffID;
    }

    public void setStaffID(Integer staffID) {
        this.staffID = staffID;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", username'" + username + '\'' +
                ", password='" + password + '\'' +
                ", status=" + status +
                ", staffID='" + staffID + '\'' +
                '}';
    }
}


