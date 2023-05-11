package com.example.finalproject.Models;
import java.util.Date;

public class Customer {

    private int id;
    private String lastName;
    private String firstName;
    private String phoneNumber;
    private Date birthday;

    public Customer() {
    }

    public Customer(String lastName, String firstName, String phoneNumber, Date birthday) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.phoneNumber = phoneNumber;
        this.birthday = birthday;
    }

    public Customer(int id, String lastName, String firstName, String phoneNumber, Date birthday) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.phoneNumber = phoneNumber;
        this.birthday = birthday;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastNamen() {
        return phoneNumber;
    }
    public String getPhoneNumber() { return phoneNumber;}
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "customer{" + "id=" + id + ", lastName=" + lastName + ", firstName=" + firstName + ", phoneNumber=" + phoneNumber + ", birthday=" + birthday + '}';
    }

}