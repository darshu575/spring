package com.xworkz.delegatecontact.dao.eventDao;

import com.xworkz.delegatecontact.entity.eventEntity.EventEntity;

public interface EventDao {
    boolean saveEvents(EventEntity eventEntity);

}
