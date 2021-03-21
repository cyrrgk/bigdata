package xyz.maxwells.bigdata.service;

import xyz.maxwells.bigdata.domain.data.CityConsumption;

import java.util.List;

/**
 * Created by wuzusheng on 2018/4/17.
 */
public interface CityConsumptionService {
    List<CityConsumption> findAll();
}
