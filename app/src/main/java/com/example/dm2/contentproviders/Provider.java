package com.example.dm2.contentproviders;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import android.provider.BaseColumns;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

/**
 * Created by dm2 on 26/01/2018.
 */

public class Provider extends ContentProvider {

    private static final String uri="content://com.example.dm2.contentproviders-2";
    private static final Uri CONTENT_URI=Uri.parse(uri);


    @Override
    public boolean onCreate() {
        return false;
    }

    @Nullable
    @Override
    public Cursor query(@NonNull Uri uri, @Nullable String[] projection, @Nullable String selection, @Nullable String[] selectionArgs, @Nullable String sortOrder) {
        return null;
    }

    @Nullable
    @Override
    public String getType(@NonNull Uri uri) {
        return null;
    }

    @Nullable
    @Override
    public Uri insert(@NonNull Uri uri, @Nullable ContentValues values) {
        return null;
    }

    @Override
    public int delete(@NonNull Uri uri, @Nullable String selection, @Nullable String[] selectionArgs) {
        return 0;
    }

    @Override
    public int update(@NonNull Uri uri, @Nullable ContentValues values, @Nullable String selection, @Nullable String[] selectionArgs) {
        return 0;
    }

    public static final class Series implements BaseColumns{
        private Series(){}

        //nombres columnas
        public static final String COL_TITULO="titulo";
        public static final String COL_CAPITULOS="capitulos";
        public static final String COL_CREADOR="creador";
    }

    //Base de datos
    private Mi_SQLiteHepler clidbh;
    private  static final String BD_NOMBRE="BDSeries";
    private static final int BD_VERSION=1;
    private static final String TABLA_SERIES="series";
}
