package com.xworkz.darshan_xworkzModul.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "user_otp")
public class OtpEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(nullable = false)

    private String email;

    @Column(nullable = false)

    private String otp;

    @Column(name = "created_time")
    private LocalDateTime createdTime;

    // getters and setters
}
