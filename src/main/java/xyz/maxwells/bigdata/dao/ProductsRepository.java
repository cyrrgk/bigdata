package xyz.maxwells.bigdata.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import xyz.maxwells.bigdata.domain.ProductsMonth;

/**
 * Created by wuzusheng on 2018/3/17.
 */
public interface ProductsRepository extends JpaRepository<ProductsMonth,String> {
}
