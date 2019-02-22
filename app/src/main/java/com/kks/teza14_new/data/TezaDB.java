package com.kks.teza14_new.data;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.content.Context;

@Database(entities = {MemberVO.class}, exportSchema = false, version = 1)
public abstract class TezaDB extends RoomDatabase {

    static String DB_NAME = "TEZA.DB";
    static TezaDB instance = null;

    public static TezaDB getInstance(Context context) {
        if (instance != null) {
            return instance;
        }
        return Room.databaseBuilder(context, TezaDB.class, DB_NAME)
                .fallbackToDestructiveMigration()
                .allowMainThreadQueries()
                .build();
    }

    // define dao
    abstract public MemberDao MemberDao();

}
