package xyz.maxwells.bigdata.service;

import xyz.maxwells.bigdata.domain.data.LastNationalConsumption;

import java.util.List;

/**
 * Created by wuzusheng on 2018/5/8.
 */
public interface LastNationalConsumptionService {
    List<LastNationalConsumption>findAll();
}
