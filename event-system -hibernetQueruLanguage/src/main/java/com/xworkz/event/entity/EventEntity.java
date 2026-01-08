package com.xworkz.event.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@NamedQueries({
        @NamedQuery(name = "AllEventNames", query = "select event from EventEntity event where event.eventName=:en"),
        @NamedQuery(name = "updateEventTimeByName", query = "update  EventEntity u set u.eventTime=:etime where u.eventName=:eventName "),
        @NamedQuery(name = "updateManagerByEventNameAndTime", query = "update  EventEntity u set u.eventManager=:emanager where u.eventName=:eventName and u.eventTime=:eventTime "),
        @NamedQuery(name = "getEventNameByEventManger", query = "select em.eventName  from EventEntity em where em.eventManager=:emaneger"),
        @NamedQuery(name = "getEventLocatioByEventTime", query = "select el.location from EventEntity el where el.eventTime=:etime "),
        @NamedQuery(name = "getAllDetails", query = "from EventEntity")
})


public class EventEntity {

    @Id
    private int eventId;
    private String eventName;
    private String location;
    private String eventManager;
    private String eventTime;
}
