package com.xworkz.delegatecontact.servies.tposervice;

import com.xworkz.delegatecontact.dao.tpodao.TpoDao;
import com.xworkz.delegatecontact.dto.EventDTO;
import com.xworkz.delegatecontact.entity.eventEntity.EventEntity;
import com.xworkz.delegatecontact.entity.eventEntity.TpoEntity;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class TpoServiceImpl  implements  TpoService{
    @Autowired
    TpoDao tpoDao;


    @Override
    public boolean tpoLoginPortal(String email, String loginCode) {

       TpoEntity tpo= tpoDao.getTpoByemail(email);
       if (tpo!=null && loginCode.equals(tpo.getLoginCode())){
           return true;
       }else
        return false;
    }

    @Override
    public List<EventDTO> getAssignedEvents(String email) {

        List<EventEntity> events=tpoDao.getAssignedEventByEmail(email);

        if (events==null || events.isEmpty()){
            return new ArrayList<>();
        }
        List<EventDTO> eventDTOList=new ArrayList<>();
        for (EventEntity eventEntity:events){
            EventDTO eventDTO=new EventDTO();
            BeanUtils.copyProperties(eventEntity,eventDTO);
            eventDTOList.add(eventDTO);
        }


        return eventDTOList;
    }
}
