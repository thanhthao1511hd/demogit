package com.example.reworksample.model.repository.local.entity;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class FlexibleDeskEntity {
    @PrimaryKey
    public int id;
    @ColumnInfo(name = "name")
    public String name;
    @ColumnInfo(name = "location")
    public String location;
    @ColumnInfo(name = "thumbnail")
    public String thumbnail;
}
