package com.example.reworksample.model.repository.local.database;

import com.example.reworksample.model.repository.local.entity.FlexibleDeskEntity;

import java.util.List;

import io.reactivex.Flowable;

public interface DbHelper {

    // recent search
    Flowable<List<FlexibleDeskEntity>> getAllEntities();
    Comparable insertEntity(FlexibleDeskEntity... flexibleDeskEntities);
    Comparable deleteEntity(FlexibleDeskEntity... flexibleDeskEntities);
    Comparable updateEntity(FlexibleDeskEntity... flexibleDeskEntities);
}
