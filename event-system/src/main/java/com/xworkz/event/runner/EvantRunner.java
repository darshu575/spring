package com.xworkz.event.runner;

import com.xworkz.event.dto.EventDto;
import com.xworkz.event.services.EventService;
import com.xworkz.event.services.EventServiceImpl;
import org.springframework.stereotype.Controller;

@Controller
public class EvantRunner {
    public static void main(String[] args) {
        EventService eventService = new EventServiceImpl();
        EventDto dto = new EventDto();
        dto.setEventId(1);
        dto.setEventName("Send Off");
        dto.setLocation("bangluru palace");
        dto.setEventTime("8 Am");
        dto.setEventManager("manoj");
        boolean isValid = eventService.validateAndSave(dto);
        System.out.println(isValid);

    }
}
