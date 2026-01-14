package com.xworkz.darshan_xworkzModul.service;

import com.xworkz.darshan_xworkzModul.dto.SignUpDto;

public interface UserService {
    boolean ValidateAndSave(SignUpDto signUpDto) throws Exception;


    Boolean  getGmailAndPassword(String gmail, String password);
}
