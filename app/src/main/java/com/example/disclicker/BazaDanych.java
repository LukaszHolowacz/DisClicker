package com.example.disclicker;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import androidx.annotation.Nullable;

public class BazaDanych extends SQLiteOpenHelper {

    public static final String NICK = "Nick";
    public static final String USER = "user";
    public static final String WIEK = "Wiek";
    public static final String WYNIK = "Wynik";
    public static final String ILE = "ile_dostaje";
    public static final String ID = "ID";

    public BazaDanych(@Nullable Context context) {
        super(context, "DisClicker.db", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String createTableStatement = "CREATE TABLE " + USER + " (" + ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " + NICK + " TEXT, " + WIEK + " INT, " + WYNIK + " INTEGER, " + ILE + " INT)";

        db.execSQL(createTableStatement);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {

    }
}
