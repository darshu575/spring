package com.xworkz.xworkzModel.service;

import com.xworkz.xworkzModel.dto.EmailOTPDto;
import com.xworkz.xworkzModel.dto.UserDto;
import com.xworkz.xworkzModel.entity.UserEntity;

import java.util.Optional;

public interface ModelService {
    boolean validAndSave(UserDto dto);

    boolean signIn(String email, String password);

    UserDto findByEmail(String email);

    UserDto updateFailedAttempts(UserDto user);

    int getFailedAttemptsByDB(int id);

    boolean setAttemptsZero(int id, int i);

    boolean svaeOtpWithEmail(EmailOTPDto emailOTPDto);

    boolean getOtpBymail(String email, String otp);

    boolean resetPassword(String email, String newPassword, String confirmPassword);


}
