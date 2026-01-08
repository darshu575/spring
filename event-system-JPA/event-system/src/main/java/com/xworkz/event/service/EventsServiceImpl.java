package com.xworkz.event.service;

import com.xworkz.event.dao.EventDAO;
import com.xworkz.event.dao.EventDAOImpl;
import com.xworkz.event.dto.EventsDTO;
import com.xworkz.event.entity.EventsEntity;
import org.springframework.beans.BeanUtils;

public class EventsServiceImpl implements EventsService {

    EventDAO eventDAO = new EventDAOImpl();

    @Override
    public boolean validateAndSave(EventsDTO eventDTO) {

        boolean validate = true;

        if (eventDTO.getId() <= 0) {
            validate = false;
        } else if (eventDTO.getOrganizerName() == null || eventDTO.getOrganizerName().isEmpty()) {
            validate = false;
        } else if (eventDTO.getTime() == null || eventDTO.getTime().isEmpty()) {
            validate = false;
        } else if (eventDTO.getLocation() == null || eventDTO.getLocation().isEmpty()) {
            validate = false;
        } else if (eventDTO.getNoOfPeople() <= 0) {
            validate = false;
        }

        EventsEntity entity = new EventsEntity();
        BeanUtils.copyProperties(eventDTO, entity);
        System.out.println(entity);


        if (validate) {
            System.out.println(entity);
            boolean saved = eventDAO.save(entity);
            if (saved) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    @Override
    public EventsDTO getById(int id) {
        EventsEntity entity=eventDAO.getEntity(id);
        System.out.println(entity+"Form DAO");

        EventsDTO eventsDTO = new EventsDTO();
        BeanUtils.copyProperties(entity,eventsDTO );

        System.out.println(eventsDTO+"Converted from");
        return eventsDTO;
    }

    @Override
    public boolean updateById(int id,EventsDTO eventsDTO) {
        boolean isUpdated = false;
        if(id!=0){
            EventsEntity entity = new EventsEntity();

            BeanUtils.copyProperties(eventsDTO,entity);
            isUpdated = eventDAO.update(id,entity);

        }
        return isUpdated;
    }

    @Override
    public boolean deleteById(int id) {
        if(id!= 0){
           boolean isDelete= eventDAO.deleteByIdDAO(id);
           return isDelete;
        }
        return false;
    }

}
