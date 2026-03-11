package com.xworkz.delegatecontact.dao.delegatedao;

import com.xworkz.delegatecontact.entity.DelegateEntity;
import com.xworkz.delegatecontact.entity.RespondEntity;
import com.xworkz.delegatecontact.entity.eventEntity.EventEntity;

import java.util.List;

public interface DelegateDao {
    boolean saveDelegate(DelegateEntity delegateEntity);

    EventEntity getEventBuId(int eventId);

    List<DelegateEntity> getDelegateByType(String delegateType);

    boolean saveRespond(RespondEntity respondEntity);

    List<RespondEntity> getRespondByTpo(String  tpoEmail);

    int countEmailSent(String email);

    int countResponses(String email);
}
