
package com.example.finalproject.DB;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.finalproject.Model.Account;
import com.example.finalproject.Model.Staff;

import java.util.ArrayList;

public class DBHelper extends SQLiteOpenHelper {
    // Constants for database name and version
    private static final String DATABASE_NAME = "MilkTeaStoreDB";
    private static final int DATABASE_VERSION = 1;

    // Constructor
    public DBHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        // Create tables
        db.execSQL(AccountTable.createTable());
        db.execSQL(StaffTable.createTable());
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // Upgrade database
    }

    //-----------------Account------------------
    // Method to add a new account
    public void addAccount(Account account) {
        SQLiteDatabase db = this.getWritableDatabase();
        AccountTable.addAccount(account, db);
        db.close();
    }
    
    // Method to delete an account
    public void deleteAccount(int id) {
        SQLiteDatabase db = this.getWritableDatabase();
        AccountTable.deleteAccount(id, db);
        db.close();
    }
    
    // Method to update an account
    public void updateAccount(Account account) {
        SQLiteDatabase db = this.getWritableDatabase();
        AccountTable.updateAccount(account, db);
        db.close();
    }

    // Method to check exists an account
    public boolean isAccountExists(String username) {
        SQLiteDatabase db = this.getReadableDatabase();
        boolean exists = AccountTable.isAccountExists(username, db);
        db.close();
        return exists;
    }

    // Method to create a demo account
    public void createDemoAccount() {
        SQLiteDatabase db = this.getWritableDatabase();
        AccountTable.createDemoAccount(db);
        db.close();
    }
    // Method get Account from username
    public Account getAccountByUsername(String username) {
        SQLiteDatabase db = this.getReadableDatabase();
        Account account = AccountTable.getAccountByUsername(username,db);
        db.close();
        return account;
    }
    //Method get all account
    public ArrayList<Account> getAllAccounts() {
        SQLiteDatabase db = this.getReadableDatabase();
        ArrayList<Account> accounts = AccountTable.getAllAccounts(db);
        return accounts;
    }
    //----------------------Staff----------------------
    // Method to add a new staff
    public void addStaff(Staff staff) {
        SQLiteDatabase db = this.getWritableDatabase();
        StaffTable.addStaff(staff, db);
        db.close();
    }
    
    // Method to delete a staff
    public void deleteStaff(int id) {
        SQLiteDatabase db = this.getWritableDatabase();
        StaffTable.deleteStaff(id, db);
        db.close();
    }
    
    // Method to update a staff
    public void updateStaff(Staff staff) {
        SQLiteDatabase db = this.getWritableDatabase();
        StaffTable.updateStaff(staff, db);
        db.close();
    }

    // Method to check exists an staff
    public boolean isStaffExist(String staffId) {
        SQLiteDatabase db = this.getReadableDatabase();
        boolean exists = StaffTable.isStaffExist(staffId, db);
        db.close();
        return exists;
    }

    // Method to create a demo account
    public void createDemoStaff() {
        SQLiteDatabase db = this.getWritableDatabase();
        StaffTable.createDemoStaff(db);
        db.close();
    }

    // Method get staff from ID
    public Staff getStaffById(int id) {
        SQLiteDatabase db = this.getReadableDatabase();
        Staff staff = StaffTable.getStaffById(id,db);
        db.close();
        return staff;
    }
    //Method get all staff
    public ArrayList<Staff> getAllStaff() {
        SQLiteDatabase db = this.getReadableDatabase();
        ArrayList<Staff> staffList = StaffTable.getAllStaff(db);
        return staffList;
    }
}
