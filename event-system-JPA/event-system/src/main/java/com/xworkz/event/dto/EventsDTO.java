package com.xworkz.event.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EventsDTO {
    private  int id;
    private String organizerName;
    private  String time;
    private  String location;
    private int noOfPeople;

    public EventsDTO(int i) {
        this.id= i;
    }

    public EventsDTO(String organizerName, String time, String mysore, int noOfPeople) {
        this.organizerName=organizerName;
        this.time=time;
        this.location=mysore;
        this.noOfPeople=noOfPeople;

    }
}
