package com.xworkz.darshan_xworkzModul.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SignUpDto {


    @NotBlank(message = "Name is Required")
    @Size(min = 3, max = 10, message = "Name is Invalid")
    @Pattern(regexp = "^[A-Za-z\\s]+$", message = "Name is  Invalid")
    private String userName;

    @NotBlank(message = "Email is Required")
    @Pattern(regexp = "^[^\\s@]+@[^\\s@]+\\.[^\\s@]+$", message = "Email is InValid")
    private String email;

    @NotBlank(message = "PhoneNumber  is Required")
    @Pattern(regexp = "^[6-9][0-9]{9}$", message = "PhoneNumber Invalid")
    private String phoneNumber;

 @NotNull(message = "Age is required")
    @Min(value = 18, message = "Age Should less than 18")
    @Max(value = 60, message = "Age Should more than 60")
    private int age;

    @NotBlank(message = "Gender  is Required")
    private String gender;

    @NotBlank(message = "Address is Required")
    @Size(min = 5, max = 20, message = "Address is Invalid")
    private String address;

    @NotBlank(message = "Password is Required")
    @Pattern(regexp = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&]).{8,}$")
    private String password;

    @NotBlank(message = "ConfirmPassword is Required")
    private String confirmPassword;


}
