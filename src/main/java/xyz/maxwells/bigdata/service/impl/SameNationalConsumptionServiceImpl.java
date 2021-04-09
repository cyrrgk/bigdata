package xyz.maxwells.bigdata.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import xyz.maxwells.bigdata.dao.SameNationalConsumptionRepository;
import xyz.maxwells.bigdata.domain.data.SameNationalConsumption;
import xyz.maxwells.bigdata.service.SameNationalConsumptionService;

import java.util.List;

/**
 * Created by wuzusheng on 2018/5/8.
 */
@Service
@Transactional
public class SameNationalConsumptionServiceImpl implements SameNationalConsumptionService{
    @Autowired
    private SameNationalConsumptionRepository dao;
    @Override
    public List<SameNationalConsumption> findAll() {
        return dao.findAll();
    }
}
