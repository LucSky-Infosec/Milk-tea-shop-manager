//package com.example.finalproject.DB;
//
//import com.example.finalproject.Model.staff;
//
//import android.content.ContentValues;
//import android.content.Context;
//import android.database.Cursor;
//import android.database.sqlite.SQLiteDatabase;
//import android.database.sqlite.SQLiteOpenHelper;
//import androidx.annotation.Nullable;
//
//public class StaffDBHelper extends SQLiteOpenHelper {
//
//    private static final String TABLE_NAME = "staff";
//    private static final String COLUMN_ID = "id";
//    private static final String COLUMN_FIRST_NAME = "first_name";
//    private static final String COLUMN_LAST_NAME = "last_name";
//    private static final String COLUMN_PHONE_NUMBER = "phone_number";
//    private static final String COLUMN_ROLE = "role";
//    private static final String COLUMN_GENDER = "gender";
//    private static final String COLUMN_ACCOUNT_ID = "account_id";
//
//    public StaffDBHelper(@Nullable Context context) {
//        super(context, DBConfig.getDatabaseName(), null, DBConfig.getDatabaseVersion());
//    }
//
//    @Override
//    public void onCreate(SQLiteDatabase db) {
//        String createTableQuery = "CREATE TABLE " + TABLE_NAME + " (" +
//                COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
//                COLUMN_FIRST_NAME + " TEXT NOT NULL, " +
//                COLUMN_LAST_NAME + " TEXT NOT NULL, " +
//                COLUMN_PHONE_NUMBER + " TEXT NOT NULL, " +
//                COLUMN_ROLE + " INTEGER, " +
//                COLUMN_GENDER + " TEXT NOT NULL, " +
//                COLUMN_ACCOUNT_ID + " INTEGER NOT NULL, " +
//                "FOREIGN KEY (" + COLUMN_ACCOUNT_ID + ") REFERENCES account(id) ON DELETE CASCADE" +
//                ")";
//        db.execSQL(createTableQuery);
//    }
//
//    @Override
//    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
//        String dropTableQuery = "DROP TABLE IF EXISTS " + TABLE_NAME;
//        db.execSQL(dropTableQuery);
//        onCreate(db);
//    }
////    @Override
////    public void onOpen(SQLiteDatabase db) {
////        super.onOpen(db);
////        String createTableQuery = "CREATE TABLE " + TABLE_NAME + " (" +
////                COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
////                COLUMN_FIRST_NAME + " TEXT NOT NULL, " +
////                COLUMN_LAST_NAME + " TEXT NOT NULL, " +
////                COLUMN_PHONE_NUMBER + " TEXT NOT NULL, " +
////                COLUMN_ROLE + " INTEGER, " +
////                COLUMN_GENDER + " TEXT NOT NULL, " +
////                COLUMN_ACCOUNT_ID + " INTEGER NOT NULL, " +
////                "FOREIGN KEY (" + COLUMN_ACCOUNT_ID + ") REFERENCES account(id) ON DELETE CASCADE" +
////                ")";
////        db.execSQL(createTableQuery);
////    }
//    public void addStaff(staff staff) {
//        ContentValues values = new ContentValues();
//        values.put(COLUMN_FIRST_NAME, staff.getFirstName());
//        values.put(COLUMN_LAST_NAME, staff.getLastName());
//        values.put(COLUMN_PHONE_NUMBER, staff.getPhoneNumber());
//        values.put(COLUMN_ROLE, staff.getRole());
//        values.put(COLUMN_GENDER, staff.getGender());
//        values.put(COLUMN_ACCOUNT_ID, staff.getAccountID());
//        SQLiteDatabase db = this.getWritableDatabase();
//        db.insert(TABLE_NAME, null, values);
//        db.close();
//    }
//
//    public int updateStaff(staff staff) {
//        SQLiteDatabase db = this.getWritableDatabase();
//        ContentValues values = new ContentValues();
//        values.put(COLUMN_FIRST_NAME, staff.getFirstName());
//        values.put(COLUMN_LAST_NAME, staff.getLastName());
//        values.put(COLUMN_PHONE_NUMBER, staff.getPhoneNumber());
//        values.put(COLUMN_ROLE, staff.getRole());
//        values.put(COLUMN_GENDER, staff.getGender());
//        values.put(COLUMN_ACCOUNT_ID, staff.getAccountID());
//        return db.update(TABLE_NAME, values, COLUMN_ID + " = ?",
//                new String[]{String.valueOf(staff.getId())});
//    }
//
//    public void deleteStaff(staff staff) {
//        SQLiteDatabase db = this.getWritableDatabase();
//        db.delete(TABLE_NAME, COLUMN_ID + " = ?",
//                new String[]{String.valueOf(staff.getId())});
//        db.close();
//    }
//
//    public boolean isAccountIdExists(String accountId) {
//        SQLiteDatabase db = this.getReadableDatabase();
//        String[] projection = { COLUMN_ID };
//        String selection = COLUMN_ACCOUNT_ID + " = ?";
//        String[] selectionArgs = { accountId };
//        Cursor cursor = db.query(TABLE_NAME, projection, selection, selectionArgs,
//                null, null, null);
//        boolean exists = (cursor.getCount() > 0);
//        cursor.close();
//        db.close();
//        return exists;
//    }
//
//    public static class AccountTable {
//        // Table name
//        public static final String TABLE_NAME = "account";
//
//        // Column names
//        public static final String COLUMN_ID = "id";
//        public static final String COLUMN_USERNAME = "username";
//        public static final String COLUMN_PASSWORD = "password";
//        public static final String COLUMN_EMAIL = "email";
//
//        // Create table statement
//        private static final String CREATE_TABLE = "CREATE TABLE " + TABLE_NAME + "("
//                + COLUMN_ID + " TEXT PRIMARY KEY,"
//                + COLUMN_USERNAME + " TEXT,"
//                + COLUMN_PASSWORD + " TEXT,"
//                + COLUMN_EMAIL + " TEXT"
//                + ")";
//
//        // Insert record
//        public static long insert(DatabaseHelper dbHelper, Account account) {
//            SQLiteDatabase db = dbHelper.getWritableDatabase();
//
//            ContentValues values = new ContentValues();
//            values.put(COLUMN_ID, account.getId());
//            values.put(COLUMN_USERNAME, account.getUsername());
//            values.put(COLUMN_PASSWORD, account.getPassword());
//            values.put(COLUMN_EMAIL, account.getEmail());
//
//            long result = db.insert(TABLE_NAME, null, values);
//
//            db.close();
//
//            return result;
//        }
//
//        // Update record
//        public static int update(DatabaseHelper dbHelper, Account account) {
//            SQLiteDatabase db = dbHelper.getWritableDatabase();
//
//            ContentValues values = new ContentValues();
//            values.put(COLUMN_USERNAME, account.getUsername());
//            values.put(COLUMN_PASSWORD, account.getPassword());
//            values.put(COLUMN_EMAIL, account.getEmail());
//
//            int result = db.update(TABLE_NAME, values, COLUMN_ID + "=?", new String[]{String.valueOf(account.getId())});
//
//            db.close();
//
//            return result;
//        }
//
//        // Delete record
//        public static int delete(DatabaseHelper dbHelper, String id) {
//            SQLiteDatabase db = dbHelper.getWritableDatabase();
//
//            int result = db.delete(TABLE_NAME, COLUMN_ID + "=?", new String[]{id});
//
//            db.close();
//
//            return result;
//        }
//
//        // Get single record
//        public static Account get(DatabaseHelper dbHelper, String id) {
//            SQLiteDatabase db = dbHelper.getReadableDatabase();
//
//            Cursor cursor = db.query(TABLE_NAME, null, COLUMN_ID + "=?", new String[]{id}, null, null, null);
//
//            Account account = null;
//
//            if (cursor.moveToFirst()) {
//                String username = cursor.getString(cursor.getColumnIndex(COLUMN_USERNAME));
//                String password = cursor.getString(cursor.getColumnIndex(COLUMN_PASSWORD));
//                String email = cursor.getString(cursor.getColumnIndex(COLUMN_EMAIL));
//
//                account = new Account(id, username, password, email);
//            }
//
//            cursor.close();
//            db.close();
//
//            return account;
//        }
//
//        // Create table
//        public static void createTable(SQLiteDatabase db) {
//            db.execSQL(CREATE_TABLE);
//        }
//
//        // Drop table
//        public static void dropTable(SQLiteDatabase db) {
//            db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
//        }
//    }
//}
