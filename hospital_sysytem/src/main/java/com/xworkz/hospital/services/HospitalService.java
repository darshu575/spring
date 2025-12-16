package com.xworkz.hospital.services;

import com.xworkz.hospital.dto.HospitalDto;

public interface HospitalService {
    boolean validateAndSave(HospitalDto hospitalDto);
}
