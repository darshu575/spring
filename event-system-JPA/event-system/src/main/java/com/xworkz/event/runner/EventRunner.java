package com.xworkz.event.runner;

import com.xworkz.event.dto.EventsDTO;
import com.xworkz.event.service.EventsService;
import com.xworkz.event.service.EventsServiceImpl;

public class EventRunner {
    public static void main( String[] args ){

        EventsDTO eventsDTO = new EventsDTO(4,"Nandan","5:00pm","Mysore",1000);

        EventsService eventsService = new EventsServiceImpl();

        EventsDTO getData = eventsService.getById(4);
        System.out.println(getData+"  From main Method");

        eventsDTO.setOrganizerName("Abhi");
        eventsDTO.setTime("6:00pm");
        eventsDTO.setLocation("Kerala");
        eventsDTO.setNoOfPeople(150);

        boolean isUpdated = eventsService.updateById(4,eventsDTO);
        if(isUpdated){
            System.out.println("update is successfull  ");
        }else {
            System.out.println("update is not successfull ");
        }

        boolean isDeleted = eventsService.deleteById(4);
        if(isDeleted){
            System.out.println("delete is SuccessFull");
        }else {
            System.out.println("Error in Delete");
        }

    }
}
