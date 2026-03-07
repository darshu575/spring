package com.xworkz.delegatecontact.entity.eventEntity;

import lombok.*;

import javax.persistence.*;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tpo")
public class TpoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String email;

    private String loginCode;



    @ManyToOne
    @JoinColumn(name="event_id")
    private EventEntity event;


    @Override
    public String toString() {
        return "TpoEntity{" +
                "email='" + email + '\'' +
                '}';
    }
}
