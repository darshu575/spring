package com.xworkz.event.runner;

import com.xworkz.event.dto.EventDto;
import com.xworkz.event.entity.EventEntity;
import com.xworkz.event.services.EventService;
import com.xworkz.event.services.EventServiceImpl;
import org.springframework.stereotype.Controller;

@Controller
public class EvantRunner {
    public static void main(String[] args) {
        EventService eventService = new EventServiceImpl();
//        EventDto dto = new EventDto();
//        dto.setEventId(6);
//        dto.setEventName("Send Off");
//        dto.setLocation("bangluru palace");
//        dto.setEventTime("8 Am");
//        dto.setEventManager("manoj");
//        boolean isValid = eventService.validateAndSave(dto);

        EventDto getData=eventService.getById(3 );
        System.out.println(getData+"details ");

         EventDto eventDto=new EventDto();
         eventDto.setEventId( 4 );
         eventDto.setEventName("send out");
         eventDto.setLocation("bengluru");
         eventDto.setEventTime("9 Am");
         eventDto.setEventManager("Darshan");
        boolean isUpdated = eventService.updateById(3,eventDto);
        if(isUpdated){
            System.out.println("update is successfull  ");
        }else {
            System.out.println("update is not successfull ");
        }


        boolean isDeleted=eventService.deleteById(1);
        if (isDeleted){
            System.out.println("Deleted");
        }
        else {
            System.out.println("not deleted");
        }

    }
}
