package com.xworkz.delegatecontact.servies;

import com.xworkz.delegatecontact.dao.AdminDao;
import com.xworkz.delegatecontact.entity.AdminEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

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
}
