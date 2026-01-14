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

        boolean isInValid = false;

        if (signUpDto.getName() == null
                || signUpDto.getName().trim().length() < 3) {
            isInValid = true;
            System.out.println("Invalid Name");
        } else if (signUpDto.getEmail() == null
                || !signUpDto.getEmail().matches("^[A-Za-z0-9+_.-]+@(.+)$")) {
            isInValid = true;
            System.out.println("Invalid Email");
        } else if (signUpDto.getPhoneNumber() == null
                || signUpDto.getPhoneNumber().toString().length() != 10) {
            isInValid = true;
            System.out.println("Invalid Phone Number");
        } else if (signUpDto.getAge() < 18 || signUpDto.getAge() > 100) {
            isInValid = true;
            System.out.println("Invalid Age");
        } else if (signUpDto.getGender() == null
                || signUpDto.getGender().trim().isEmpty()) {
            isInValid = true;
            System.out.println("Invalid Gender");
        } else if (signUpDto.getAddress() == null
                || signUpDto.getAddress().trim().length() < 5) {
            isInValid = true;
            System.out.println("Invalid Address");
        } else if (signUpDto.getPassword() == null
                || signUpDto.getPassword().length() < 6) {
            isInValid = true;
            System.out.println("Invalid Password");
        } else if (!signUpDto.getPassword().equals(signUpDto.getConfirmPassword())) {
            isInValid = true;
            System.out.println("Password And Confirm Password Not Match");

        } else {
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

        return isInValid;


    }

    @SneakyThrows
    @Override
    public Boolean getGmailAndPassword(String gmail, String password) {


        UserEntity userEntity =  userDao.getGmail(gmail);
        if (userEntity == null) {
            System.out.println("Email Not Found");
            return null;
        }
        try {
            // Step 2: Get encrypted password from DB

            String encryptedPassword = userEntity.getPassword();


            // Step 3: Decrypt password
            String decryptedPassword = decrypt(encryptedPassword);

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

        return null;


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
