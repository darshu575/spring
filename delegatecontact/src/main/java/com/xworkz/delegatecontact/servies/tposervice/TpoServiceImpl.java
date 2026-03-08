package com.xworkz.delegatecontact.servies.tposervice;

import com.xworkz.delegatecontact.dao.tpodao.TpoDao;
import com.xworkz.delegatecontact.entity.eventEntity.TpoEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}
