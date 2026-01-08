package com.xworkz.event.dao;

import com.xworkz.event.entity.EventEntity;

import java.util.List;

public interface EventDAo {
    boolean save(EventEntity eventEntity);

    EventEntity getEntity(int i);

    boolean update(int i, EventEntity eventEntity);

    boolean deleteByIdDAO(int i);

    EventEntity EegetEventDetailsByEventName(String eventName);

    EventEntity getEventDetailsByEventTime(String s);

    Object[] getEventMangerAndLocationByEventName(String event);

    List<EventEntity> getAllDetails();

    String getEventLocatioByEventTime(String time);

    List<String> getEventNameByEventManger(String manger);

    boolean updateEventManagerByEventNameAndEventTime(String eventmanager, String ename, String time);

    boolean updateEventTtimeByEventManeger(String t, String managerName);

    boolean DeletByEventManager(String managerName);

}
