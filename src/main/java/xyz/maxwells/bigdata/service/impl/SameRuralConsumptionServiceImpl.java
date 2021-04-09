package xyz.maxwells.bigdata.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import xyz.maxwells.bigdata.dao.SameRuralConsumptionRepository;
import xyz.maxwells.bigdata.domain.data.SameRuralConsumption;
import xyz.maxwells.bigdata.service.SameRuralConsumptionService;

import java.util.List;

/**
 * Created by wuzusheng on 2018/5/8.
 */
@Service
@Transactional
public class SameRuralConsumptionServiceImpl implements SameRuralConsumptionService{
    @Autowired
    private SameRuralConsumptionRepository dao;
    @Override
    public List<SameRuralConsumption> findAll() {
        return dao.findAll();
    }
}
