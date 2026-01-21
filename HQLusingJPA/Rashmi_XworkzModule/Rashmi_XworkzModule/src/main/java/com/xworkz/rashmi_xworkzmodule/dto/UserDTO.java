package com.xworkz.rashmi_xworkzmodule.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.*;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class UserDTO {


    private int userId;
    @NotBlank(message = "Name is required")
    @Size(min = 3,max=45 , message = "Name must be greater than 3 characters")
    @Pattern(regexp = "^[A-Za-z ]{2,45}$",message ="Only letters and spaces allowed")
    private String userName;

    @NotBlank(message = "Email is required")
    @Pattern(regexp = "^[a-zA-Z0-9._%+-]+@gmail\\.com$",message = "Enter a valid email address which should include @gmail.com" )
    private String userEmail;

    @NotBlank(message = "Phone number is required")
    @Pattern(regexp = "^\\+91[6-9]\\d{9}$",message = "Enter valid number (ex: +919876543210)")
    private String phoneNumber;

    @NotNull(message = "Age is required")
    @Min(value = 18,message = "Age must be greater than 18")
    @Max(value = 100,message = "Age must be less than 100")
    private int age;

    @NotBlank(message = "Please select Gender")
    private String gender;

    @NotBlank(message = "Address is required")
    @Size(min = 5,message =  "Address must be more than 5 characters")
    private String address;

    @NotBlank(message = "Password is required")
    @Pattern(regexp = "^(?=.*[A-Za-z])(?=.*\\d).+$",message = "Password must contain letters and numbers")
    private String password;

    @NotBlank(message = "Confirm password is required")
    private String confirmPassword;
}
