package xyz.maxwells.bigdata.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import xyz.maxwells.bigdata.dao.SameNationalFoodRepository;
import xyz.maxwells.bigdata.domain.data.SameNationalFood;
import xyz.maxwells.bigdata.service.SameNationalFoodService;

import java.util.List;

/**
 * Created by wuzusheng on 2018/5/8.
 */
@Service
@Transactional
public class SameNationalFoodServiceImpl implements SameNationalFoodService{
    @Autowired
    private SameNationalFoodRepository dao;

    @Override
    public List<SameNationalFood> findAll() {
        return dao.findAll();
    }
}
