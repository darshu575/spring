package com.xworkz.event.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity

public class EventsEntity {
    @Id

    private  int id;

    private String organizerName;

    private  String time;

    private  String location;

    private int noOfPeople;
}