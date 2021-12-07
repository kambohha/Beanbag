package com.example.beanbag;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.view.View;

public class DBHelper extends SQLiteOpenHelper {
    private static final String dbname = "BeanBag1.db";
    private static final  String TABLE1="tbl_login";
    private static final  String TABLE2="tbl_SignUp";
    private static final  String TABLE3="tbl_record";
    public DBHelper(Context context) {
        super(context,dbname,null,1);
    }


    @Override
    public void onCreate(SQLiteDatabase db) {



        String tbl_login="CREATE TABLE "+TABLE1+"(Id INTEGER PRIMARY KEY autoincrement,Email text,password text)";
        String tbl_SignUp="CREATE TABLE "+TABLE2+"(Id INTEGER PRIMARY KEY autoincrement,name text,username text,Email text,password text,Cpassword text,btnmale text,Female text)";

        db.execSQL(tbl_SignUp);
        db.execSQL(tbl_login);



    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        db.execSQL("DROP TABLE IF EXISTS tbl_SignUp");
        db.execSQL("DROP TABLE IF EXISTS tbl_login");
        onCreate(db);
    }
    public String addRecord(String p1, String p2,String p3,String p4,String p5,String p6,String p7) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv = new ContentValues();
        cv.put("name", p1);
        cv.put("username", p2);
        cv.put("Email", p3);
        cv.put("password", p4);
        cv.put("Cpassword", p5);
        cv.put("btnmale",p6);
        cv.put("Female",p7);
        long res = db.insert("tbl_SignUp", null, cv);
        if (res == -1)
            return "Failed";
        else
            return "Successfully Inserted";

    }
    public String addlogin(String p1, String p2) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv = new ContentValues();
        cv.put("E-mail", p1);
        cv.put("password", p2);

        long res = db.insert("tbl_login", null, cv);
        if (res == -1)
            return "Failed";
        else
            return "Successfully Inserted";

    }
}
