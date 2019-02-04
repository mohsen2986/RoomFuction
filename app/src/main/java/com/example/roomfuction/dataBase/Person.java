package com.example.roomfuction.dataBase;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

@Entity(tableName = "person_table")
public class Person {
    @PrimaryKey

    @NonNull

    @ColumnInfo(name = "name")
    private String name;
    @ColumnInfo(name = "family")
    private String family;
    @ColumnInfo(name ="gender")
    private Boolean gender;
    @ColumnInfo(name ="number")
    private int number;

    @NonNull
    public String getName(){return name;}
    @NonNull
    public String getFamily(){return family;}

    //primitive type can not annotate
    public boolean getGender(){return gender;}
    public int getNumber(){return number;}

    public Person(){
        name="invalid";
        family="invalid";
        gender=true;
        number=123456;
    }
    public Person(String name,String family , boolean gender, int number)
    {
        this.name=name;
        this.family=family;
        this.gender=gender;
        this.number=number;
    }
    //ask for this functions
    public void setName(String name){this.name=name;}
    public void setFamily(String family){this.family=family;}
    public void setGender(Boolean gender){this.gender=gender;}
    public void setNumber(int number){this.number=number;}

}
