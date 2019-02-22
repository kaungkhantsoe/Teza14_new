package com.kks.teza14_new.data;

import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;

public interface MemberDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    abstract void insertMember(MemberVO model);

    @Query("SELECT * FROM member WHERE id = :id")
    abstract MemberVO getMemberById(int id);
}
