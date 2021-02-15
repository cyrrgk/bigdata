package xyz.maxwells.bigdata.service;

import xyz.maxwells.bigdata.domain.ProductsMonth;

import java.util.List;

/**
 * Created by wuzusheng on 2018/3/17.
 */
public interface ProductsService {
    List<ProductsMonth> findAll();
}
