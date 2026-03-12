package com.xworkz.delegatecontact.servies;

import com.xworkz.delegatecontact.dao.AdminDao;
import com.xworkz.delegatecontact.entity.AdminEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class AdminServiceImpl implements AdminService{
    @Autowired
    AdminDao adminDao;

    @Override
    public boolean validateAdmin(String email, String password) {
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        AdminEntity admin = adminDao.getByEmail(email);

        if (admin != null && encoder.matches(password,admin.getPassword())) {
            return true;
        }

        return false;
    }

    @Override
    public int getTotalEvents() {
        return adminDao.getAllEvent();
    }

    @Override
    public int getTotalDelegates() {
        return adminDao.getAllGelegate();
    }

    @Override
    public int getTotalResponses() {
        return adminDao.getAllResponses();
    }

    @Override
    public List<Object[]> getEventResponseCount() {
        return adminDao.getEventResponses();
    }
}
