package com.xworkz.xworkzModel.entity.batchEntity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class BatchEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int batchId;
    private String batchName;
    private String batchCode;
    private String trainerName;
    private String course;
    private LocalDate startDate;
    private LocalDate endDate;
}
