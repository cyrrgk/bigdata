package xyz.maxwells.bigdata.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import xyz.maxwells.bigdata.dao.LastRuralConsumptionRepository;
import xyz.maxwells.bigdata.domain.data.LastRuralConsumption;
import xyz.maxwells.bigdata.service.LastRuralConsumptionService;

import java.util.List;

/**
 * Created by wuzusheng on 2018/5/8.
 */
@Service
@Transactional
public class LastRuralConsumptionServiceImpl implements LastRuralConsumptionService{
    @Autowired
    private LastRuralConsumptionRepository dao;
    @Override
    public List<LastRuralConsumption> findAll() {
        return dao.findAll();
    }
}
