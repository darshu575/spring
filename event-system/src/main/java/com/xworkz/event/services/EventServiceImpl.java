package com.xworkz.event.services;
import com.xworkz.event.dao.EventDAo;
import com.xworkz.event.dao.EventDAoImpl;
import com.xworkz.event.dto.EventDto;
import com.xworkz.event.entity.EventEntity;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;


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
}
