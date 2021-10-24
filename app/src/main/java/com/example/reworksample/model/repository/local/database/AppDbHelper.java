package com.example.reworksample.model.repository.local.database;

import com.example.reworksample.model.repository.local.entity.FlexibleDeskEntity;

import java.util.List;

import io.reactivex.Flowable;

public class AppDbHelper implements DbHelper{

    private static AppDbHelper sInstance;
    private AppDatabase appDatabase;


    public AppDbHelper(AppDatabase appDatabase) {
        this.appDatabase = appDatabase;
    }

    public static AppDbHelper getsInstance(AppDatabase appDatabase) {
        if (sInstance==null)
        {
            sInstance=new AppDbHelper(appDatabase);
        }
        return sInstance;
    }
    @Override
    public Flowable<List<FlexibleDeskEntity>> getAllEntities() {
        return appDatabase.getDAO().getAll();
    }

    @Override
    public Comparable insertEntity(FlexibleDeskEntity... flexibleDeskEntities) {
        return appDatabase.getDAO().insertAll();
    }

    @Override
    public Comparable deleteEntity(FlexibleDeskEntity... flexibleDeskEntities) {
        return appDatabase.getDAO().delete();
    }

    @Override
    public Comparable updateEntity(FlexibleDeskEntity... flexibleDeskEntities) {
        return appDatabase.getDAO().update();
    }
}
