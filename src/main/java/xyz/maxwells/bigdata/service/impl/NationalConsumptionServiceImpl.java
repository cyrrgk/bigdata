package xyz.maxwells.bigdata.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xyz.maxwells.bigdata.dao.NationalConsumptionRepository;
import xyz.maxwells.bigdata.domain.data.NationalConsumption;
import xyz.maxwells.bigdata.service.NationalConsumptionService;

import java.util.List;

/**
 * Created by wuzusheng on 2018/4/1.
 */
@Service
public class NationalConsumptionServiceImpl implements NationalConsumptionService {
    @Autowired
    private NationalConsumptionRepository dao;
    @Override
    public List<NationalConsumption> findAll() {
        return dao.findAll();
    }
}
