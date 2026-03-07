package com.xworkz.delegatecontact.dao.emailsentdao;

import com.xworkz.delegatecontact.entity.eventEntity.EventEntity;
import com.xworkz.delegatecontact.entity.eventEntity.TpoEntity;

import java.util.List;

public interface EmailSentDao {
    EventEntity getEventById(int eventId);

    List<TpoEntity> getTpoByEventId(int eventId);

    void updateEvent(EventEntity eventEntity);

}
