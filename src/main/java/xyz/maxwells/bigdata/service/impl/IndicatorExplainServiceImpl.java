package xyz.maxwells.bigdata.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xyz.maxwells.bigdata.dao.IndicatorExplainRepository;
import xyz.maxwells.bigdata.domain.data.IndicatorExplain;
import xyz.maxwells.bigdata.service.IndicatorExplainService;

/**
 * Created by wuzusheng on 2018/4/10.
 */
@Service
public class IndicatorExplainServiceImpl implements IndicatorExplainService{
    @Autowired
    private IndicatorExplainRepository dao;
    @Override
    public IndicatorExplain findByName(String name) {
        return dao.findByIndicator(name);
    }
}
