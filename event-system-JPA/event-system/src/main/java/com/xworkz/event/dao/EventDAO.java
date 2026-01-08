package com.xworkz.event.dao;

import com.xworkz.event.entity.EventsEntity;

public interface EventDAO {

    boolean save(EventsEntity entity);
//
    EventsEntity getEntity(int id);
//
    boolean update(int id, EventsEntity entity);
//
    boolean deleteByIdDAO( int id);
}
