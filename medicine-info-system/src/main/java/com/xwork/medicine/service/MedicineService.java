package com.xwork.medicine.service;

import com.xwork.medicine.dto.MedicineDto;

public interface MedicineService {

    boolean validateAndSave(MedicineDto medicineDto);
}
