package com.xworkz.darshan_xworkzModul.service;

import com.xworkz.darshan_xworkzModul.dto.SignUpDto;

public interface UserService {
    boolean ValidateAndSave(SignUpDto signUpDto) throws Exception;


    SignUpDto getPasswordByGmail(String gmail, String password);

    int getCount(String gmail);

    void getCountGmail(String gmail);

    void updateCount(String gmail);


    boolean updatePassword(String email, String newPassword, String confirmPassword) throws Exception;

}
