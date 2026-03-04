package com.xworkz.delegatecontact.dao.eventDao;

import com.xworkz.delegatecontact.entity.eventEntity.EventEntity;

import java.util.List;

public interface EventDao {
    boolean saveEvents(EventEntity eventEntity);

    List<EventEntity> getAllEvents();

}
