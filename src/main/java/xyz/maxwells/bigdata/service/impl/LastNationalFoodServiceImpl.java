package xyz.maxwells.bigdata.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import xyz.maxwells.bigdata.dao.LastNationalFoodRepository;
import xyz.maxwells.bigdata.domain.data.LastNationalFood;
import xyz.maxwells.bigdata.service.LastNationalFoodService;

import java.util.List;

/**
 * Created by wuzusheng on 2018/5/8.
 */
@Service
@Transactional
public class LastNationalFoodServiceImpl implements LastNationalFoodService{
    @Autowired
    private LastNationalFoodRepository dao;
    @Override
    public List<LastNationalFood> findAll() {
        return dao.findAll();
    }
}
