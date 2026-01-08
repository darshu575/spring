package com.xworkz.event.service;

import com.xworkz.event.dto.EventsDTO;

public interface EventsService {
    boolean validateAndSave(EventsDTO eventsDTO);
//
    EventsDTO getById(int id);
//
    boolean updateById(int id,EventsDTO eventsDTO);
//
    boolean deleteById(int id);
}
