package com.xworkz.darshan_xworkzModul.service.respondService;

import com.xworkz.darshan_xworkzModul.dao.respondDao.RespondDao;
import com.xworkz.darshan_xworkzModul.dto.respondDto.RespondDto;
import com.xworkz.darshan_xworkzModul.entity.respondEntity.RespondEntity;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RespondServiceImpl implements RespondService{
    @Autowired
    RespondDao respondDao;
    @Override
    public Boolean saveRespond(RespondDto respondDto) {
        if (respondDto!=null){
            RespondEntity respondEntity=new RespondEntity();
            BeanUtils.copyProperties(respondDto,respondEntity);
          Boolean  isSaved= respondDao.saveRespond(respondEntity);
        }
        return true;
    }
}
