package com.xworkz.xworkzModel.utility;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class EmailOTPSender {

    @Autowired
    private JavaMailSender mailSender;

    /* Generate 6-digit random OTP */
    private String generateOtp() {
        int otp = new Random().nextInt(900000) + 100000;
        return String.valueOf(otp);
    }

    /* Generate + Send OTP */
    public String sendOtp(String email) {

        String otp = generateOtp();

        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo(email);
        message.setSubject("OTP Verification");
        message.setText("Your OTP is: " + otp + "\nValid for 5 minutes.");

        mailSender.send(message);

        return otp; // return so caller can store (session / DB)
    }
}
