package com.xworkz.xworkzModel.service;

import com.xworkz.xworkzModel.dao.ModelDao;
import com.xworkz.xworkzModel.dto.EmailOTPDto;
import com.xworkz.xworkzModel.dto.UserDto;
import com.xworkz.xworkzModel.entity.EmailOTPEntity;
import com.xworkz.xworkzModel.entity.UserEntity;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Base64;


@Service
public class ModelServiceImpl implements ModelService {

    @Autowired
    ModelDao dao;


    @Override
    public boolean validAndSave(UserDto dto) {

        System.out.println("Service" + dto);
        boolean valid = true;

        if (dto == null) {
            return false;
        }

        // First Name
        if (dto.getFName() == null || dto.getFName().trim().length() <= 5) {
            valid = false;
        }

        // Last Name
        if (dto.getLName() == null || dto.getLName().trim().length() <= 5) {
            valid = false;
        }

        // Age
        if (dto.getAge() <= 18) {
            valid = false;
        }

        // Gender
        if (dto.getGender() == null || dto.getGender().trim().isEmpty()) {
            valid = false;
        }

        // Email
        if (dto.getEmail() == null || !dto.getEmail().endsWith("@gmail.com")) {
            valid = false;
        }

        // Mobile
        String mobile = String.valueOf(dto.getMobile());
        if (!mobile.matches("[6-9][0-9]{9}")) {
            valid = false;
        }

        if (valid) {
            System.out.println("All validations passed. Save logic here.");


            try {
                String encryptedPassword = encryptPassword(dto.getPassword());
                dto.setPassword(encryptedPassword);

                UserEntity entity = new UserEntity();

                BeanUtils.copyProperties(dto, entity);
                return dao.save(entity);

            } catch (Exception e) {
                throw new RuntimeException(e);
            }

        }

        return valid;
    }

    @Override
    public boolean signIn(String email, String password) {

        if (email == null || password == null) {
            return false;
        }

        if (email.trim().isEmpty() || password.trim().isEmpty()) {
            return false;
        }
        String encryptedPassword = null;
        try {
            encryptedPassword = encryptPassword(password);

            return dao.checkEmailAndPassword(email, encryptedPassword) != null;
//            System.out.println("service "+entity.getPassword());


        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }

    @Override
    public UserDto findByEmail(String email) {

        UserEntity entity = dao.findByEmail(email);
        if (entity != null) {

//                String decryptedPassword = decryptPassword(entity.getPassword());
            entity.setPassword(null);

            UserDto dto = new UserDto();
            BeanUtils.copyProperties(entity, dto);
            System.out.println("service dto:" + dto);
            return dto;
        } else return null;
    }

    @Override
    public UserDto updateFailedAttempts(UserDto user) {

        UserEntity entity = new UserEntity();

        BeanUtils.copyProperties(user, entity);

        UserEntity updatedEntity = dao.updateFailedAttempts(entity);
        UserDto updatedDto = new UserDto();
        BeanUtils.copyProperties(updatedEntity, updatedDto);
        return updatedDto;
    }

    @Override
    public int getFailedAttemptsByDB(int id) {

        return dao.getFailedAttemptsByDB(id);
    }

    @Override
    public boolean setAttemptsZero(int id, int i) {
        return dao.setAttemptsZero(id, i);

    }

    @Override
    public boolean svaeOtpWithEmail(EmailOTPDto emailOTPDto) {
        EmailOTPEntity emailOTPEntity = new EmailOTPEntity();


        if (emailOTPDto != null) {
            BeanUtils.copyProperties(emailOTPDto, emailOTPEntity);
            return dao.svaeOtpWithEmail(emailOTPEntity);
        }
        return false;
    }

    @Override
    public boolean getOtpBymail(String email, String otp) {
        EmailOTPDto dto = new EmailOTPDto();

        if (email != null && otp != null) {
            EmailOTPEntity entity = dao.getOtpBymail(email);

            BeanUtils.copyProperties(entity, dto);

            if (dto.getOtp().equals(otp)) {
                dao.deleteOtp(entity);
                return true;
            }
        }
        return false;

    }

    @Override
    public boolean resetPassword(String email, String newPassword, String confirmPassword) {

        UserEntity entity = dao.findByEmail(email);
        System.out.println("entity by mail before check :" + entity);
        if (entity != null) {
            try {

                System.out.println("entity exist in service :" + entity);

                String encryptPassword = encryptPassword(newPassword);
                System.out.println("encrypt password in service :" + encryptPassword);

                return dao.resetPassword(entity.getId(), encryptPassword(newPassword));

            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        } else return false;
    }


    private static final byte[] keyValue = "1234567890123456".getBytes();

    private String encryptPassword(String password) throws Exception {
        SecretKeySpec key = new SecretKeySpec(keyValue, "AES");//AES - 16 byte -->128 bits

        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(Cipher.ENCRYPT_MODE, key);
        byte[] encVal = cipher.doFinal(password.getBytes());
        return Base64.getEncoder().encodeToString(encVal);
    }

    // decryption of password

    private String decryptPassword(String encryptedPassword) throws Exception {

        SecretKeySpec key = new SecretKeySpec(keyValue, "AES");

        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(Cipher.DECRYPT_MODE, key);

        byte[] decodedBytes = Base64.getDecoder().decode(encryptedPassword);
        byte[] decryptedBytes = cipher.doFinal(decodedBytes);

        return new String(decryptedBytes);
    }

}
