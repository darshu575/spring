package com.xworkz.xworkzModel.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {


    private int id;


    @NotNull
    @Size(min = 4, max = 10, message = "First Name size must be between 4 and 10")
    private String fName;

    @NotNull
    @Size(min = 4, max = 10, message = "Last Name size must be between 4 and 10")
    private String lName;

    @NotNull(message = "Not null")
    @Min(value = 18, message = "age must be greater than 18")
    @Max(value = 60, message = "age must be less than 60")
    private Integer age;

    //    @NotBlank(message = "Please select your gender")
    @NotBlank(message = "Please select your gender")
    @Pattern(
            regexp = "Male|Female|Other",
            message = "Invalid gender selection"
    )
    private String gender;

    @NotNull
    @Pattern(regexp = "^(?!\\.)(?!.*\\.\\.)[a-zA-Z0-9._%+-]{1,64}(?<!\\.)@gmail\\.com$", message = "e-mail must follow formate..")
    private String email;

    @NotNull
    @Min(value = 6000000000L, message = "number starts from 6 to 9")
    @Max(value = 9999999999L)
    private Long mobile;

    @Pattern(regexp = "(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&]).{8,}", message = "password contain")
    private String password;

    private String confirmPassword;

    private int failedAttempts;


}
