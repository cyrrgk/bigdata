package xyz.maxwells.bigdata.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import xyz.maxwells.bigdata.dao.LastCityConsumptionRepository;
import xyz.maxwells.bigdata.domain.data.LastCityConsumption;
import xyz.maxwells.bigdata.service.LastCityConsumptionService;

import java.util.List;

/**
 * Created by wuzusheng on 2018/5/8.
 */
@Service
@Transactional
public class LastCityConsumptionServiceImpl implements LastCityConsumptionService{
    @Autowired
    private LastCityConsumptionRepository dao;
    @Override
    public List<LastCityConsumption> findAll() {
        return dao.findAll();
    }
}
