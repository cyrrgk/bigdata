package xyz.maxwells.bigdata.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import xyz.maxwells.bigdata.domain.data.SameCityConsumption;

/**
 * Created by wuzusheng on 2018/5/8.
 */
public interface SameCityConsumptionRepository extends JpaRepository<SameCityConsumption,String> {
}
