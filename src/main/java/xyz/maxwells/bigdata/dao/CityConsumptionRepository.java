package xyz.maxwells.bigdata.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import xyz.maxwells.bigdata.domain.data.CityConsumption;

/**
 * Created by wuzusheng on 2018/4/17.
 */
public interface CityConsumptionRepository extends JpaRepository<CityConsumption,String>{
}
