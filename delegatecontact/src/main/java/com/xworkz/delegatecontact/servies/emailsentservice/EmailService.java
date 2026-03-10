package com.xworkz.delegatecontact.servies.emailsentservice;

import com.xworkz.delegatecontact.entity.eventEntity.EventEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailService {
    @Autowired
    private JavaMailSender javaMailSender;


    public void sendEventToTpoEmails(String toEmail, String loginCode, EventEntity eventEntity) {

        SimpleMailMessage simpleMailMessage=new SimpleMailMessage();
        simpleMailMessage.setTo(toEmail);
        simpleMailMessage.setSubject("Event Invitation");
        String portalLink = "http://localhost:8085/delegatecontact/tpo/login";
        String emailBody =
                "Dear TPO,\n\n" +

                        "Greetings from our placement team.\n\n" +

                        "You are invited to participate in the following campus recruitment event:\n\n" +

                        "--------------------------------------------------\n" +
                        "Event Title : " + eventEntity.getEventTitle() + "\n" +
                        "Event Date  : " + eventEntity.getEventDate() + "\n" +
                        "Location    : " + eventEntity.getEventLocation() + "\n" +
                        "Participate Target    : " + eventEntity.getTargetCount() + "\n" +
                        "Please login to confirm participation:\n" +
                        portalLink + "\n\n" +

                        "You can access the event portal using the following credentials:\n\n" +

                        "Email      : " + toEmail + "\n" +
                        "Login Code : " + loginCode + "\n\n" +

                        "Please use this login code to access the event dashboard and confirm participation.\n\n" +

                        "If you have any questions, feel free to contact our placement office.\n\n" +

                        "Best Regards,\n" +
                        "Training & Placement Cell\n" +
                        "ABC Institute of Technology\n" +
                        "Email: placement@abcinstitute.com\n" +
                        "Phone: +91-9876543210\n";

        simpleMailMessage.setText(emailBody);
        javaMailSender.send(simpleMailMessage);

    }

    public void sendEventToDelegate(String emails, EventEntity eventEntity) {
        SimpleMailMessage simpleMailMessage=new SimpleMailMessage();
        simpleMailMessage.setTo(emails);
        simpleMailMessage.setSubject("Event Invitation");
        String RespondLink =" http://localhost:8085/delegatecontact/delegate/respond?eventId="
        + eventEntity.getId();;
        String emailBody =
                "Dear Delegate,\n\n" +

                        "Greetings from our Tpo.\n\n" +

                        "You are invited to participate in the following campus recruitment event:\n\n" +

                        "--------------------------------------------------\n" +
                        "Event Title : " + eventEntity.getEventTitle() + "\n" +
                        "Event Date  : " + eventEntity.getEventDate() + "\n" +
                        "Location    : " + eventEntity.getEventLocation() + "\n" +
                        "Participate Target    : " + eventEntity.getTargetCount() + "\n" +
                        "Please Give Your Respond:\n" +
                        RespondLink + "\n\n" +

                        "If you have any questions, feel free to contact our placement office.\n\n" +

                        "Best Regards,\n" +
                        "Training & Placement Cell\n" +
                        "ABC Institute of Technology\n" +
                        "Email: placement@abcinstitute.com\n" +
                        "Phone: +91-9876543210\n";

        simpleMailMessage.setText(emailBody);
        javaMailSender.send(simpleMailMessage);

    }
}
