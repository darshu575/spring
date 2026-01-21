package com.xworkz.rashmi_xworkzmodule.repository;

import com.xworkz.rashmi_xworkzmodule.entity.UserEntity;

public interface XworkzRepository {
    boolean save(UserEntity userEntity);

    String checkUser(String email);

    void updateCount(String email);

    int getCount(String email);

    void setCountToZero(String email);

    boolean checkUserExistsByEmail(String userEmail);

    boolean checkUserExistsByPhone(String phoneNumber);
}
