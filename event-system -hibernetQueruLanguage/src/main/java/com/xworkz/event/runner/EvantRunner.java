package com.xworkz.event.runner;

import com.xworkz.event.dto.EventDto;
import com.xworkz.event.entity.EventEntity;
import com.xworkz.event.services.EventService;
import com.xworkz.event.services.EventServiceImpl;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class EvantRunner {
    public static void main(String[] args) {
        EventService eventService = new EventServiceImpl();
        EventDto dto = new EventDto();
        dto.setEventId(7);
        dto.setEventName("Magic Show");
        dto.setLocation("mysuru ");
        dto.setEventTime("10:30 Am");
        dto.setEventManager("modhak");
//        boolean isValid = eventService.validateAndSave(dto);


        System.out.println("HQL start");
//      EventDto eventDto =eventService.getEventByEventName("send out");
//        System.out.println(eventDto);


//        EventDto eventDto = eventService.getDetailsByEventTime("9 Am");
//        System.out.println("Details :" + eventDto);

//   `  Object[] getManagerAndLocation=  eventService.getManagerAndLocationByEventName("MovieShow");
//        Stream.of(getManagerAndLocation).forEach(System.out::println);
//


        List<EventEntity> allEvent = eventService.getAllEventsDetials();
        allEvent.stream().forEach(System.out::println);

        System.out.println("forloop");

        for (EventEntity e : allEvent) {
            System.out.println(e);
        }


        String loction = eventService.getLocationByTime("10 Am");
        System.out.println(loction);


        System.out.println("getEventNameByManger");

        List<String> eventName = eventService.getEventNameByManger("manoj");
        eventName.stream().forEach(System.out::println);


        System.out.println("Upadte Method using HQL");

        System.out.println( eventService.updateManegerNameByEventNameAndEventTime("Srujan","Send Off","8 Am"));

        System.out.println(eventService.updateEventTimeByEventName("12:Am", "Magic Show"));

        System.out.println("Delete");

        System.out.println(eventService.DeleteByManagerName("modhak"));
        System.out.println("HQL ended");

//        boolean isDeleted = eventService.deleteById(1);
//        if (isDeleted) {
//            System.out.println("Deleted");
//        } else {
//            System.out.println("not deleted");
//        }

    }
}
