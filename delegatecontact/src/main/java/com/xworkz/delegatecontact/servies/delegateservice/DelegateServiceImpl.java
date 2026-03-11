package com.xworkz.delegatecontact.servies.delegateservice;

import com.xworkz.delegatecontact.dao.delegatedao.DelegateDao;
import com.xworkz.delegatecontact.dto.DelegateDto;
import com.xworkz.delegatecontact.dto.RespondDto;
import com.xworkz.delegatecontact.entity.DelegateEntity;
import com.xworkz.delegatecontact.entity.RespondEntity;
import com.xworkz.delegatecontact.entity.eventEntity.EventEntity;
import com.xworkz.delegatecontact.servies.emailsentservice.EmailService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class DelegateServiceImpl implements DelegateService{
    @Autowired
    DelegateDao delegateDao;

    @Autowired
    EmailService emailService;


    @Override
    public boolean saveDelegate(DelegateDto dto) {

        DelegateEntity delegateEntity=new DelegateEntity();
        BeanUtils.copyProperties(dto,delegateEntity);
        boolean saved=delegateDao.saveDelegate(delegateEntity);
        if (saved){
            return  true;
        }

        return false;
    }

    @Override
    public void sendEmailToDelegate(int eventId, String tpoEmail) {
        EventEntity eventEntity=delegateDao.getEventBuId(eventId);
        System.out.println("sendEmailToDelegate in service Started");
        String delegateType= eventEntity.getDelegateType();
        System.out.println(delegateType);
        List<DelegateEntity> delegateEntities=delegateDao.getDelegateByType(delegateType);
        System.out.println(delegateEntities);
        for (DelegateEntity delegate:delegateEntities){
            String emails=delegate.getEmail();
            emailService.sendEventToDelegate(emails,eventEntity,tpoEmail);

        }


    }

    @Override
    public boolean saveRespond(RespondDto respondDto) {
        RespondEntity respondEntity=new RespondEntity();
        BeanUtils.copyProperties(respondDto,respondEntity);
        boolean isSaved=delegateDao.saveRespond(respondEntity);
        if (isSaved){
            return true;
        }


        return false;
    }

    @Override
    public List<RespondDto> getResponsesByTpo(String tpoEmail) {
        List<RespondEntity> respondEntities=delegateDao.getRespondByTpo(tpoEmail);
        if (respondEntities == null || respondEntities.isEmpty()) {
            return new ArrayList<>();
        }
List<RespondDto> respondDtos=new ArrayList<>();
        for (RespondEntity respondEntity:respondEntities){
            RespondDto respondDto=new RespondDto();
            BeanUtils.copyProperties(respondEntity,respondDto);
            respondDtos.add(respondDto);
        }

        return respondDtos;
    }

    @Override
    public int countEmailsSent(String email) {
        return delegateDao.countEmailSent(email);
    }

    @Override
    public int countResponses(String email) {
        return delegateDao.countResponses(email);
    }
}
