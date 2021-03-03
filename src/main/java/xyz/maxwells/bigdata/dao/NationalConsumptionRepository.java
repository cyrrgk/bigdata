package xyz.maxwells.bigdata.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import xyz.maxwells.bigdata.domain.data.NationalConsumption;

/**
 * Created by wuzusheng on 2018/4/1.
 */
public interface NationalConsumptionRepository extends JpaRepository<NationalConsumption,String>{
}
