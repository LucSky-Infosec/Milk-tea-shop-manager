package com.example.finalproject.Model;

public class Staff {
    private Integer id;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private Integer role;
    private String gender;

    private String avatar;
    private Integer accountID;

    public  Staff(){
    }
    public Staff(String firstName, String lastName, String phoneNumber, Integer role, String gender, String avatar, Integer accountID) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.role = role;
        this.gender = gender;
        this.avatar = avatar;
        this.accountID = accountID;
    }

    public Staff(Integer id, String firstName, String lastName, String phoneNumber, Integer role, String gender, String avatar, Integer accountID) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.role = role;
        this.gender = gender;
        this.avatar = avatar;
        this.accountID = accountID;
    }
//
//    public Staff(Integerid, String firstName, String lastName, String phoneNumber, Integerrole, String gender, IntegeraccountID) {
//        this.id = id;
//        this.firstName = firstName;
//        this.lastName = lastName;
//        this.phoneNumber = phoneNumber;
//        this.role = role;
//        this.gender = gender;
//        this.accountID = accountID;
//    }

    public Integer getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public Integer getRole() {
        return role;
    }

    public String getGender() {
        return gender;
    }

    public Integer getAccountID() {
        return accountID;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setRole(Integer role) {
        this.role = role;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAccountID(Integer accountID) {
        this.accountID = accountID;
    }
    public String getAvatar() {
        return avatar;
    }
    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "id='" + id + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", role=" + role +
                ", gender='" + gender + '\'' +
                ", avatar='" + avatar + '\'' +
                ", accountID='" + accountID + '\'' +
                '}';
    }

}
