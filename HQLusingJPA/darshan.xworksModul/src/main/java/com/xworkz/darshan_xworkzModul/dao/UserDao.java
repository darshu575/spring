package com.xworkz.darshan_xworkzModul.dao;

import com.xworkz.darshan_xworkzModul.entity.UserEntity;

public interface UserDao {
    boolean save(UserEntity userEntity);

    UserEntity getGmail(String gmail);
}
