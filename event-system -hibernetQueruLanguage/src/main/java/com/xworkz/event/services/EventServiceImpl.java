package com.xworkz.event.services;
import com.xworkz.event.dao.EventDAo;
import com.xworkz.event.dao.EventDAoImpl;
import com.xworkz.event.dto.EventDto;
import com.xworkz.event.entity.EventEntity;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;


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

    @Override
    public EventDto getEventByEventName(String eventName) {
        if (eventName!=null){
            EventDto eventDto=new EventDto();
          EventEntity entity=  eventDAo.EegetEventDetailsByEventName(eventName);
          BeanUtils.copyProperties(entity,eventDto);
            return eventDto;

        }
        return null ;
    }

    @Override
    public EventDto getDetailsByEventTime(String s) {

        if (s!=null){

            EventDto eventDto=new EventDto();
          EventEntity entity=  eventDAo.getEventDetailsByEventTime(s);
          BeanUtils.copyProperties(entity,eventDto);
          return eventDto;

        }
        return null;
    }

    @Override
    public Object[] getManagerAndLocationByEventName(String event) {
        if (event!=null){

           Object[] isGet= eventDAo.getEventMangerAndLocationByEventName(event);

            return isGet;
        }


        return new String[0];
    }

    @Override
    public List<EventEntity> getAllEventsDetials() {

       List<EventEntity> isFind= eventDAo.getAllDetails();
       if (isFind!=null) {


           return isFind;
       }else
        return Collections.emptyList();
    }

    @Override
    public String getLocationByTime(String time) {

        if (time!=null){
         String getLocation=   eventDAo.getEventLocatioByEventTime(time);
         return getLocation;

        }


        return "null";
    }

    @Override
    public List<String> getEventNameByManger(String manger) {

        if (manger!=null){
         List<String> getManger=  eventDAo.getEventNameByEventManger(manger);
         return getManger;
        }
        return Collections.emptyList();
    }

    @Override
    public boolean updateManegerNameByEventNameAndEventTime(String eventmanager, String ename, String time) {
        return eventDAo.updateEventManagerByEventNameAndEventTime(eventmanager,ename,time);
    }

    @Override
    public boolean updateEventTimeByEventName(String t, String managerName) {
        return eventDAo.updateEventTtimeByEventManeger(t,managerName);
    }

    @Override
    public boolean DeleteByManagerName(String managerName) {
        return eventDAo.DeletByEventManager(managerName);
    }
}
