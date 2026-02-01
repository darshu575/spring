package com.xworkz.xworkzModel.dao.batchDao;

import com.xworkz.xworkzModel.entity.batchEntity.BatchEntity;

import java.util.List;

public interface BatchDao {
    boolean savebatch(BatchEntity entity);

    List<BatchEntity> getAllBatch();

    BatchEntity fetchById(int batchId);
}
