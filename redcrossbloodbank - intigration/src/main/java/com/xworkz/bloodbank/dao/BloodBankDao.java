package com.xworkz.bloodbank.dao;

import com.xworkz.bloodbank.dto.BloodBankDto;
import com.xworkz.bloodbank.entity.RedCrossBloodEntity;

public interface BloodBankDao {
    public  boolean save(BloodBankDto bloodBankDto);
    boolean saveDonor(RedCrossBloodEntity redCrossBloodEntity);

    RedCrossBloodEntity SearchEmail(String gmail);

    RedCrossBloodEntity searchByID(String id);

}
