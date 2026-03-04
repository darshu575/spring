package com.xworkz.delegatecontact.servies.eventService;

import com.xworkz.delegatecontact.dto.EventDTO;
import com.xworkz.delegatecontact.entity.eventEntity.EventEntity;

import java.util.List;

public interface EventService {
    boolean saveEvent(EventDTO dto);
    public List<EventDTO> getAllEvents();
}
