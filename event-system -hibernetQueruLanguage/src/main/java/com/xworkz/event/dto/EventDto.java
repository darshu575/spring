package com.xworkz.event.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EventDto {

    private  int eventId;
    private String eventName;
    private String location;
    private  String eventManager;
    private String eventTime;




}
