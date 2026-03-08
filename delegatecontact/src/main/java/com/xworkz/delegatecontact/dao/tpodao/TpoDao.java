package com.xworkz.delegatecontact.dao.tpodao;

import com.xworkz.delegatecontact.entity.eventEntity.TpoEntity;

public interface TpoDao {
    TpoEntity getTpoByemail(String email);
}
