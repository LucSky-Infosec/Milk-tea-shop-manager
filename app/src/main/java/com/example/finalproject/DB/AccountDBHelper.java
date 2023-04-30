//package com.example.finalproject.DB;
//import com.example.finalproject.Model.account;
//import android.content.ContentValues;
//import android.content.Context;
//import android.database.Cursor;
//import android.database.sqlite.SQLiteDatabase;
//import android.database.sqlite.SQLiteOpenHelper;
//import androidx.annotation.Nullable;
//public class AccountDBHelper extends SQLiteOpenHelper {
//    private static final String TABLE_NAME = "account";
//    private static final String COLUMN_ID = "id";
//    private static final String COLUMN_USERNAME = "username";
//    private static final String COLUMN_PASSWORD = "password";
//    private static final String COLUMN_STATUS = "status";
//    private static final String COLUMN_STAFF_ID = "staffID";
//
//    public AccountDBHelper(@Nullable Context context) {
//        super(context, DBConfig.getDatabaseName(), null, DBConfig.getDatabaseVersion());
//    }
//
//    @Override
//    public void onCreate(SQLiteDatabase db) {
//        String query = "CREATE TABLE " + TABLE_NAME + "("
//                + COLUMN_ID + " INTEGER PRIMARY KEY,"
//                + COLUMN_USERNAME + " TEXT,"
//                + COLUMN_PASSWORD + " TEXT,"
//                + COLUMN_STATUS + " INTEGER,"
//                + COLUMN_STAFF_ID + " TEXT"
//                + ")";
//        db.execSQL(query);
//    }
//
//    @Override
//    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
//        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
//        onCreate(db);
//    }
////    @Override
////    public void onOpen(SQLiteDatabase db) {
////        super.onOpen(db);
////        String query = "CREATE TABLE " + TABLE_NAME + "("
////                + COLUMN_ID + " INTEGER PRIMARY KEY,"
////                + COLUMN_USERNAME + " TEXT,"
////                + COLUMN_PASSWORD + " TEXT,"
////                + COLUMN_STATUS + " INTEGER,"
////                + COLUMN_STAFF_ID + " TEXT"
////                + ")";
////        db.execSQL(query);
////    }
//
//    public void addAccount(account account) {
//        ContentValues values = new ContentValues();
//        values.put(COLUMN_USERNAME, account.getUsername());
//        values.put(COLUMN_PASSWORD, account.getPassword());
//        values.put(COLUMN_STATUS, account.getStatus());
//        values.put(COLUMN_STAFF_ID, account.getStaffID());
//
//        SQLiteDatabase db = getWritableDatabase();
//        db.insert(TABLE_NAME, null, values);
//        db.close();
//    }
//    public void deleteAccount(String username) {
//        SQLiteDatabase db = getWritableDatabase();
//        String selection = COLUMN_ID + " = ?";
//        String[] selectionArgs = {username};
//        db.delete(TABLE_NAME, selection, selectionArgs);
//        db.close();
//    }
////    public void deleteAllAccounts() {
////        SQLiteDatabase db = getWritableDatabase();
////        db.delete(TABLE_NAME, null, null);
////        db.close();
////    }
//
//    public void updateAccount(account account) {
//        SQLiteDatabase db = getWritableDatabase();
//        ContentValues values = new ContentValues();
//        values.put(COLUMN_USERNAME, account.getUsername());
//        values.put(COLUMN_PASSWORD, account.getPassword());
//        values.put(COLUMN_STATUS, account.getStatus());
//        values.put(COLUMN_STAFF_ID, account.getStaffID());
//
//        String selection = COLUMN_ID + " = ?";
//        String[] selectionArgs = {account.getId()};
//        db.update(TABLE_NAME, values, selection, selectionArgs);
//        db.close();
//    }
//
//    public boolean isAccountExists(String username) {
//        SQLiteDatabase db = getReadableDatabase();
//        String[] projection = {COLUMN_ID};
//        String selection = COLUMN_USERNAME + " = ?";
//        String[] selectionArgs = {username};
//        Cursor cursor = db.query(TABLE_NAME, projection, selection, selectionArgs, null, null, null);
//        int count = cursor.getCount();
//        cursor.close();
//        db.close();
//        return count > 0;
//    }
//
//
//}
