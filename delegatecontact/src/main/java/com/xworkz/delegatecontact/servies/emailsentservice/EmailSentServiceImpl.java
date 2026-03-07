package com.xworkz.delegatecontact.servies.emailsentservice;

import com.xworkz.delegatecontact.dao.emailsentdao.EmailSentDao;
import com.xworkz.delegatecontact.entity.eventEntity.EventEntity;
import com.xworkz.delegatecontact.entity.eventEntity.TpoEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmailSentServiceImpl implements EmailSentService {
    @Autowired
    EmailSentDao emailSentDao;
    @Autowired
    EmailService emailService;


    @Override
    public void sendEventEmailToTPO(int eventId) {

        EventEntity eventEntity = emailSentDao.getEventById(eventId);
        List<TpoEntity> tpoList = emailSentDao.getTpoByEventId(eventId);

        for (TpoEntity tpo : tpoList) {
            String email = tpo.getEmail();

            String loginCode = tpo.getLoginCode();
            emailService.sendEventToTpoEmails(email, loginCode, eventEntity);


        }
        // mark emails as sent
        eventEntity.setEmailSent(true);
        emailSentDao.updateEvent(eventEntity);

    }
}
