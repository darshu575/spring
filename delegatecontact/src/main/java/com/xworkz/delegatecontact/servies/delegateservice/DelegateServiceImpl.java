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
    public void sendEmailToDelegate(int eventId) {
        EventEntity eventEntity=delegateDao.getEventBuId(eventId);
        System.out.println("sendEmailToDelegate in service Started");
        String delegateType= eventEntity.getDelegateType();
        System.out.println(delegateType);
        List<DelegateEntity> delegateEntities=delegateDao.getDelegateByType(delegateType);
        System.out.println(delegateEntities);
        for (DelegateEntity delegate:delegateEntities){
            String emails=delegate.getEmail();
            emailService.sendEventToDelegate(emails,eventEntity);

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
}
