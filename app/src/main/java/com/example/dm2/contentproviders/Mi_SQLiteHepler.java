package com.example.dm2.contentproviders;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by dm2 on 26/01/2018.
 */

public class Mi_SQLiteHepler  extends SQLiteOpenHelper {

    //Crear la tabla serie con una sentencia
    String sqlCreate="CREATE TABLE series (" +
            "_id INTEGER PRIMARY KEY AUTOINCREMENT," +
            "titulo TEXT," +
            "capitulos INTEGER" +
            "creador   TEXT)";

    public Mi_SQLiteHepler(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL(sqlCreate);
        //Hacemos unas cuantas inserciones
        db.execSQL("INSERT INTO series VLAUES(null,'Black mirror',23,'Billie Joe')");
        db.execSQL("INSERT INTO series VLAUES(null,'Vikingos',24,'Sidgursson')");
        db.execSQL("INSERT INTO series VLAUES(null,'Breacking bad',25,'Macmanaman')");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
