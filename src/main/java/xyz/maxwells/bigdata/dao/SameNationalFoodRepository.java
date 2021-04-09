package xyz.maxwells.bigdata.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import xyz.maxwells.bigdata.domain.data.SameNationalFood;

/**
 * Created by wuzusheng on 2018/5/8.
 */
public interface SameNationalFoodRepository extends JpaRepository<SameNationalFood,String> {
}
