package xyz.maxwells.bigdata.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import xyz.maxwells.bigdata.dao.ProductsRepository;
import xyz.maxwells.bigdata.domain.ProductsMonth;
import xyz.maxwells.bigdata.service.ProductsService;

import java.util.List;

/**
 * Created by wuzusheng on 2018/3/17.
 */

@Service
@Transactional
public class ProductsServiceImpl implements ProductsService {
    @Autowired
    private ProductsRepository dao;
    @Override
    public List<ProductsMonth> findAll() {
        return dao.findAll();
    }
}
