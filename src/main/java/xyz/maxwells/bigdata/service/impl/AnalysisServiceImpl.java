package xyz.maxwells.bigdata.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xyz.maxwells.bigdata.dao.AnalysisRepository;
import xyz.maxwells.bigdata.domain.data.Analysis;
import xyz.maxwells.bigdata.service.AnalysisService;

/**
 * Created by wuzusheng on 2018/4/16.
 */
@Service
public class AnalysisServiceImpl implements AnalysisService{
    @Autowired
    private AnalysisRepository dao;
    @Override
    public Analysis findByindicator(String indicator) {
        return dao.findByIndicator(indicator);
    }
}
