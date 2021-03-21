package xyz.maxwells.bigdata.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xyz.maxwells.bigdata.dao.CityConsumptionRepository;
import xyz.maxwells.bigdata.domain.data.CityConsumption;
import xyz.maxwells.bigdata.service.CityConsumptionService;

import java.util.List;

/**
 * Created by wuzusheng on 2018/4/17.
 */
@Service
public class CityConsumptionServiceImpl implements CityConsumptionService{
    @Autowired
    private CityConsumptionRepository dao;
    @Override
    public List<CityConsumption> findAll() {
        return dao.findAll();
    }
}
