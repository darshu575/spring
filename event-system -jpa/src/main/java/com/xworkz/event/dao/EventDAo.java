package com.xworkz.event.dao;

import com.xworkz.event.entity.EventEntity;

public interface EventDAo {
    boolean save(EventEntity eventEntity);

    EventEntity getEntity(int i);

    boolean update(int i, EventEntity eventEntity);

    boolean deleteByIdDAO(int i);
}
