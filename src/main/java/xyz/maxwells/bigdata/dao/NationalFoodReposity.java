package xyz.maxwells.bigdata.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import xyz.maxwells.bigdata.domain.data.NationalFood;

/**
 * Created by wuzusheng on 2018/4/16.
 */
public interface NationalFoodReposity extends JpaRepository<NationalFood,String> {

}
