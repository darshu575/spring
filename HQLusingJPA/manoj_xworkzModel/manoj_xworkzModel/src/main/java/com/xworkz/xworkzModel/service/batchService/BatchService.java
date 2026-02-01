package com.xworkz.xworkzModel.service.batchService;

import com.xworkz.xworkzModel.dto.batchdto.BatchDTO;

import java.util.List;

public interface BatchService {
    boolean addNewBatch(BatchDTO dto);

    List<BatchDTO> getAllBatch();

    BatchDTO fetchById(int batchId);
}
