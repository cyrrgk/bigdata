package xyz.maxwells.bigdata.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import xyz.maxwells.bigdata.dao.RuralConsumptionRepository;
import xyz.maxwells.bigdata.domain.data.RuralConsumption;
import xyz.maxwells.bigdata.service.RuralConsumptionService;

import java.util.List;

/**
 * Created by wuzusheng on 2018/4/17.
 */
@Service
@Transactional
public class RuralConsumptionServiceImpl implements RuralConsumptionService{
    @Autowired
    private RuralConsumptionRepository dao;
    @Override
    public List<RuralConsumption> findAll(){
        return dao.findAll();
    }

}
