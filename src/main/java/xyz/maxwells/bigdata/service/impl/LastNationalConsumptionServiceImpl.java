package xyz.maxwells.bigdata.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import xyz.maxwells.bigdata.dao.LastNationalConsumptionRepository;
import xyz.maxwells.bigdata.domain.data.LastNationalConsumption;
import xyz.maxwells.bigdata.service.LastNationalConsumptionService;

import java.util.List;

/**
 * Created by wuzusheng on 2018/5/8.
 */
@Service
@Transactional
public class LastNationalConsumptionServiceImpl implements LastNationalConsumptionService {
    @Autowired
    private LastNationalConsumptionRepository dao;
    @Override
    public List<LastNationalConsumption> findAll() {
        return dao.findAll();
    }
}
