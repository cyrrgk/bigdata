package xyz.maxwells.bigdata.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xyz.maxwells.bigdata.dao.NationalFoodReposity;
import xyz.maxwells.bigdata.domain.data.NationalFood;
import xyz.maxwells.bigdata.service.NationalFoodService;

import java.util.List;

/**
 * Created by wuzusheng on 2018/4/16.
 */
@Service
public class NationalFoodServiceImpl implements NationalFoodService {
    @Autowired
    private NationalFoodReposity dao;
    @Override
    public List<NationalFood> findall() {
        return dao.findAll();
    }
}
