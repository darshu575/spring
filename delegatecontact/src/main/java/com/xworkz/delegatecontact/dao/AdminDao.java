package com.xworkz.delegatecontact.dao;

import com.xworkz.delegatecontact.entity.AdminEntity;

public interface AdminDao {
    AdminEntity getByEmail(String email);
}
