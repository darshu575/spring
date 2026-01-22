package com.xworkz.darshan_xworkzModul.service;

import com.xworkz.darshan_xworkzModul.dao.UserDao;
import com.xworkz.darshan_xworkzModul.dto.SignUpDto;
import com.xworkz.darshan_xworkzModul.entity.UserEntity;
import lombok.SneakyThrows;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

import java.util.Base64;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserDao userDao;
    private static final String SECRET_KEY = "MySuperSecretKey";

    @Override
    public boolean ValidateAndSave(SignUpDto signUpDto) throws Exception {


        //  Encrypt password using Cipher

        String encryptedPassword = encrypt(signUpDto.getPassword());
        signUpDto.setPassword(encryptedPassword);


        //  Do not save confirm password
        signUpDto.setConfirmPassword(null);

        System.out.println("User data validated successfully");
        System.out.println(signUpDto);

        UserEntity userEntity = new UserEntity();
        BeanUtils.copyProperties(signUpDto, userEntity);
        return userDao.save(userEntity);


    }

    @SneakyThrows
    @Override
    public Boolean getGmailAndPassword(String gmail, String password) {


        UserEntity userEntity = userDao.getGmail(gmail);
        if (userEntity == null) {
            System.out.println("Email Not Found");
            return null;
        }
        try {
            // Step 2: Get encrypted password from DB

            String encryptedPassword = userEntity.getPassword();


            // Step 3: Decrypt password
            String decryptedPassword = decrypt(encryptedPassword);
            System.out.println(decryptedPassword);

            if (password.equals(decryptedPassword)) {

                SignUpDto signUpDto = new SignUpDto();
                BeanUtils.copyProperties(userEntity, signUpDto);

                // Do NOT expose password back to controller
//                signUpDto.setPassword(null);
//                signUpDto.setConfirmPassword(null);

                System.out.println("Login SuccessFully");
                System.out.println(signUpDto);
                return true;
            } else {
                System.out.println("Invalid Password");
            }


        } catch (Exception e) {
            e.printStackTrace();

        }

        return false;


    }

    @Override
    public int getCount(String gmail) {
        return userDao.getCount(gmail);
    }

    @Override
    public void getCountGmail(String gmail) {
        userDao.getCountGmail(gmail);
    }

    @Override
    public void updateCount(String gmail) {
        userDao.updateCount(gmail);
    }

    @Override
    public boolean updatePassword(String email, String newPassword, String confirmPassword) throws Exception {
        String encryptNewPassowrd=encrypt(newPassword);
        System.out.println(encryptNewPassowrd);
        boolean isUpadate=userDao.updatePassword(email,encryptNewPassowrd);

        return isUpadate;
    }

    private String encrypt(String strToEncrypt) throws Exception {
        SecretKeySpec secretKey = new SecretKeySpec(SECRET_KEY.getBytes(), "AES");

        Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
        cipher.init(Cipher.ENCRYPT_MODE, secretKey);

        byte[] encryptedBytes = cipher.doFinal(strToEncrypt.getBytes("UTF-8"));

        return Base64.getEncoder().encodeToString(encryptedBytes);
    }

    public String decrypt(String strToDecrypt) throws Exception {
        SecretKeySpec secretKey = new SecretKeySpec(SECRET_KEY.getBytes(), "AES");

        Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
        cipher.init(Cipher.DECRYPT_MODE, secretKey);

        byte[] decodedBytes = Base64.getDecoder().decode(strToDecrypt);

        return new String(cipher.doFinal(decodedBytes), "UTF-8");
    }




}
