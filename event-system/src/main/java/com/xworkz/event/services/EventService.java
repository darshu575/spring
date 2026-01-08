package com.xworkz.event.services;

import com.xworkz.event.dto.EventDto;

public interface EventService {
    boolean validateAndSave(EventDto dto);
}
