package com.example.roomfuction.dataBase;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import java.util.List;

@Dao
public interface PersonDao {
    @Insert
    void inset(Person person);

    @Query("DELETE FROM person_table")
    void deleteAll();

    @Query("SELECT * FROM person_table")
    List<Person> getAllPeson();

    //using this query is true
    @Query("SELECT name FROM person_table ORDER BY name ASC")
    List<Person> getPesonName();

}
