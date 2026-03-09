package com.xworkz.delegatecontact.dao.tpodao;

import com.xworkz.delegatecontact.entity.eventEntity.EventEntity;
import com.xworkz.delegatecontact.entity.eventEntity.TpoEntity;

import java.util.List;

public interface TpoDao {
    TpoEntity getTpoByemail(String email);

    List<EventEntity> getAssignedEventByEmail(String email);
}
