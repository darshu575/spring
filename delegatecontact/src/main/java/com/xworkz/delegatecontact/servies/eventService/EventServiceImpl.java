package com.xworkz.delegatecontact.servies.eventService;

import com.xworkz.delegatecontact.dao.eventDao.EventDao;
import com.xworkz.delegatecontact.dto.EventDTO;
import com.xworkz.delegatecontact.dto.RespondDto;
import com.xworkz.delegatecontact.entity.RespondEntity;
import com.xworkz.delegatecontact.entity.eventEntity.EventEntity;
import com.xworkz.delegatecontact.entity.eventEntity.TpoEntity;
import com.xworkz.delegatecontact.util.CodeGeneratorUtil;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class EventServiceImpl implements EventService {
    @Autowired
    EventDao eventDao;

    @Override
    public boolean saveEvent(EventDTO dto) {
        System.out.println("saveEvent service Started");
        EventEntity eventEntity = new EventEntity();
        BeanUtils.copyProperties(dto, eventEntity);
        if (dto.getEventDate() != null && !dto.getEventDate().isEmpty()) {
            eventEntity.setEventDate(LocalDate.parse(dto.getEventDate()));
        }
        // Handling the Multiple Tpo Emails And Set
        List<TpoEntity> tpoList = new ArrayList<>();
        if (dto.getTpoEmailList() != null) {
            for (String email : dto.getTpoEmailList()) {

                if (email != null && !email.trim().isEmpty()) {

                    TpoEntity tpo = new TpoEntity();
                    tpo.setEmail(email);
                    tpo.setLoginCode(CodeGeneratorUtil.generateCode());
                    tpo.setEvent(eventEntity);  // very important
                    tpoList.add(tpo);
                }
            }
        }
        eventEntity.setTpoList(tpoList);
        boolean saved = eventDao.saveEvents(eventEntity);
        if (saved) {
            return true;
        } else
            return false;
    }

    @Override
    public List<EventDTO> getAllEvents() {
        List<EventEntity> getEvents = eventDao.getAllEvents();
        System.out.println("in service" + getEvents);
        if (getEvents == null || getEvents.isEmpty()) {
            return new ArrayList<>();
        }
        List<EventDTO> eventList = new ArrayList<>();
        for (EventEntity eventEntity : getEvents) {
            EventDTO eventDTO = new EventDTO();
            BeanUtils.copyProperties(eventEntity, eventDTO);

            if (eventEntity.getEventDate()!=null){
                eventDTO.setEventDate(eventEntity.getEventDate().toString());

            }


            //convert Tpo list to email list

            List<String> emails = new ArrayList<>();
            if (eventEntity.getTpoList() != null) {
                for (TpoEntity tpo : eventEntity.getTpoList()) {
                    emails.add(tpo.getEmail());
                }
            }
            eventDTO.setTpoEmailList(emails);
            eventList.add(eventDTO);


        }
        return eventList;
    }

    @Override
    public List<RespondDto> getAllTpoResponses() {

        List<RespondEntity> respondEntities=eventDao.getAllTpoResponses();
        if (respondEntities==null || respondEntities.isEmpty()){
            return new ArrayList<>();
        }
        List<RespondDto> respondDtoList = new ArrayList<>();
        for (RespondEntity respondEntity:respondEntities){
            RespondDto respondDto=new RespondDto();
            BeanUtils.copyProperties(respondEntity,respondDto);
            respondDtoList.add(respondDto);
        }


        return respondDtoList;
    }
}
