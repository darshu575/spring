package com.xworkz.event.services;

import com.xworkz.event.dto.EventDto;
import com.xworkz.event.entity.EventEntity;

import java.util.List;

public interface EventService {
    boolean validateAndSave(EventDto dto);

    EventDto getById(int i);

    boolean updateById(int i, EventDto eventDto);

    boolean deleteById(int i);

    EventDto getEventByEventName(String eventName);

    EventDto getDetailsByEventTime(String s);

    Object[] getManagerAndLocationByEventName(String event);

    List<EventEntity> getAllEventsDetials();

    String getLocationByTime(String time);

    List<String> getEventNameByManger(String manger);

    boolean updateManegerNameByEventNameAndEventTime(String Eventmanager, String ename, String time);


    boolean updateEventTimeByEventName(String t, String managerName);

    boolean DeleteByManagerName(String managerName);
}
