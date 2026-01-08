package com.xworkz.event.services;
import com.xworkz.event.dao.EventDAo;
import com.xworkz.event.dao.EventDAoImpl;
import com.xworkz.event.dto.EventDto;
import com.xworkz.event.entity.EventEntity;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


@Service
public class EventServiceImpl implements EventService{

    EventDAo eventDAo=new EventDAoImpl();
    EventEntity eventEntity=new EventEntity();
    @Override
    public boolean validateAndSave(EventDto dto) {

        if (dto!=null){

            BeanUtils.copyProperties(dto,eventEntity);
          boolean isSaved=  eventDAo.save(eventEntity);


            return isSaved;
        }





        return false;
    }

    @Override
    public EventDto getById(int i) {
        EventEntity eventity=eventDAo.getEntity(i);
        System.out.println(eventity);

        EventDto eventDto=new EventDto();
        BeanUtils.copyProperties(eventity,eventDto);

        System.out.println(eventDto+"Converted form");


        return eventDto;
    }

    @Override
    public boolean updateById(int i, EventDto eventDto) {
        boolean isUpdated = false;
        if(i!=0){
            EventEntity entity = new EventEntity();

            BeanUtils.copyProperties(eventDto,entity);
            isUpdated = eventDAo.update(i,entity);

        }
        return isUpdated;
    }

    @Override
    public boolean deleteById(int i) {
        if(i!= 0){
            boolean isDelete= eventDAo.deleteByIdDAO(i);
            return isDelete;
        }
        return false;
    }
}
