package com.xworkz.darshan_xworkzModul.service;

import com.xworkz.darshan_xworkzModul.entity.memberEntity.MemberEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmailService {

    @Autowired
    private JavaMailSender mailSender;

    public void sendOtp(String toEmail,String  otp){
        SimpleMailMessage mailMessage=new SimpleMailMessage();
        mailMessage.setTo(toEmail);
        mailMessage.setSubject("Sending Otp");
        mailMessage.setText("Your Otp is :"+otp);

        mailSender.send(mailMessage);
    }


    public void sendBulkEmail(List<MemberEntity> members){

        for (MemberEntity member : members) {

            if(member.getEmail() != null) {

                String responseLink =
                        "http://10.211.142.41/xworksModul/respond?memberId="
                                + member.getMemberId();

                SimpleMailMessage mailMessage = new SimpleMailMessage();
                mailMessage.setTo(member.getEmail());
                mailMessage.setSubject("Notification Form Xworkz");

                mailMessage.setText(
                        "Hello " + member.getMemberName() + ",\n\n" +
                                "Please click below link to respond:\n" +
                                responseLink
                );

                mailSender.send(mailMessage);
            }
        }
    }

}
