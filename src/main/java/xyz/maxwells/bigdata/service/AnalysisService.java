package xyz.maxwells.bigdata.service;

import xyz.maxwells.bigdata.domain.data.Analysis;

/**
 * Created by wuzusheng on 2018/4/16.
 */
public interface AnalysisService {
    Analysis findByindicator(String indicator);
}
