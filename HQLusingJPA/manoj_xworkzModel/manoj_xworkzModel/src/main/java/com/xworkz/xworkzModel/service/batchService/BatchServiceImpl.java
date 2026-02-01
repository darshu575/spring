package com.xworkz.xworkzModel.service.batchService;

import com.xworkz.xworkzModel.dao.batchDao.BatchDao;
import com.xworkz.xworkzModel.dto.batchdto.BatchDTO;
import com.xworkz.xworkzModel.entity.batchEntity.BatchEntity;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BatchServiceImpl implements BatchService {

    @Autowired
    BatchDao dao;

    @Override
    public boolean addNewBatch(BatchDTO dto) {
        System.out.println("service started to save batch..");

        BatchEntity entity = new BatchEntity();

        BeanUtils.copyProperties(dto,entity);

        return dao.savebatch(entity);
    }
    @Override
    public List<BatchDTO> getAllBatch() {

        System.out.println("getting all batches in service");

        List<BatchEntity> entities = dao.getAllBatch();

        if (entities == null || entities.isEmpty()) {
            return List.of();
        }
        List<BatchDTO> dtoList = new ArrayList<>();

        for (BatchEntity entity : entities) {
            BatchDTO dto = new BatchDTO();
            BeanUtils.copyProperties(entity, dto);
            dtoList.add(dto);
        }
        return dtoList;
    }

    @Override
    public BatchDTO fetchById(int batchId) {
        BatchDTO dto = new BatchDTO();
      BatchEntity entity =  dao.fetchById(batchId);

      BeanUtils.copyProperties(entity,dto);

        return dto;
    }

}
