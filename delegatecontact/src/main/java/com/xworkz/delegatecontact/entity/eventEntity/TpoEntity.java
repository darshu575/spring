package com.xworkz.delegatecontact.entity.eventEntity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tpo")
public class TpoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String email;

    @ManyToOne
    @JoinColumn(name="event_id")
    private EventEntity event;
}
