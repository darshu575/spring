package com.xworkz.event.services;

import com.xworkz.event.dto.EventDto;
import com.xworkz.event.entity.EventEntity;

public interface EventService {
    boolean validateAndSave(EventDto dto);

    EventDto getById(int i);

    boolean updateById(int i, EventDto eventDto);

    boolean deleteById(int i);
}
