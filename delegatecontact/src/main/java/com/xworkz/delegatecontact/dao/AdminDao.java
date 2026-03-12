package com.xworkz.delegatecontact.dao;

import com.xworkz.delegatecontact.entity.AdminEntity;

import java.util.List;

public interface AdminDao {
    AdminEntity getByEmail(String email);

    int getAllEvent();

    int getAllGelegate();

    int getAllResponses();

    List<Object[]> getEventResponses();

}
