package xyz.maxwells.bigdata.service;

import xyz.maxwells.bigdata.domain.data.IndicatorExplain;

/**
 * Created by wuzusheng on 2018/4/10.
 */
public interface IndicatorExplainService {
    IndicatorExplain findByName(String name);
}
