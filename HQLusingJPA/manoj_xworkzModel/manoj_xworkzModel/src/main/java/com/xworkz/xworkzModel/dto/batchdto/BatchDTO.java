package com.xworkz.xworkzModel.dto.batchdto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BatchDTO {

    private int batchId;

    @NotNull
    @Size(min = 4, max = 10, message = "Batch Name size must be between 4 and 10")
    private String batchName;

    @NotNull
    @Size(min = 4, max = 10, message = "Batch Code size must be between 4 and 10")
    private String batchCode;

    @NotNull
    @Size(min = 4, max = 10, message = "Trainer Name size must be between 4 and 10")
    private String trainerName;

    @NotNull(message = "please enter course name..")
    @Size(min = 2, max = 10, message = "Course size must be between 2 and 10")
    private String course;

    @NotNull
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate startDate;

    @NotNull
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate endDate;

    // Cross-field validation

    @AssertTrue(message = "End date must be greater than Start date")
    public boolean isEndDateValid() {
        if (startDate == null || endDate == null) {
            return true; // let @NotNull handle this
        }
        return endDate.isAfter(startDate);
    }
}
