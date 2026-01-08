package com.xworkz.event.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class EventEntity {

    @Id
    private  int eventId;
    private String eventName;
    private String location;
    private  String eventManager;
    private String eventTime;
}
