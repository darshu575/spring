package com.xworkz.delegatecontact.entity.eventEntity;


import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Getter
@Setter

@NoArgsConstructor
@AllArgsConstructor
@Entity
    @Table(name="event")
    public class EventEntity {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int id;

        private String organizerName;
        private String officialEmail;
        private String organizationName;
        private String eventTitle;
        private String eventType;
        private String delegateType;
        private int targetCount;
        private String eventMode;
        private LocalDate eventDate;
        private String eventLocation;
        private String meetingLink;

        @Column(length=5000)
        private String eventDescription;

        private String brochurePath;

        @OneToMany(mappedBy="event", cascade=CascadeType.ALL,fetch = FetchType.LAZY)
        private List<TpoEntity> tpoList;

    @Column(name="email_sent")
    private Boolean emailSent;

        // getters setters


    }

