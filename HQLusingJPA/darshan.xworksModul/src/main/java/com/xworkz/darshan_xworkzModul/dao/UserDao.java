package com.xworkz.darshan_xworkzModul.dao;

import com.xworkz.darshan_xworkzModul.entity.OtpEntity;
import com.xworkz.darshan_xworkzModul.entity.UserEntity;
import org.springframework.stereotype.Repository;

public interface UserDao  {
    boolean save(UserEntity userEntity);

    UserEntity getGmail(String gmail);

    int getCount(String gmail);

    void getCountGmail(String gmail);

    void updateCount(String gmail);


    void saveOtp(OtpEntity otpEntity);

    OtpEntity findOtpByGmail(String email, String otp);

    void deleteOpt(OtpEntity dbOtp);

}
