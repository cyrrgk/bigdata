package xyz.maxwells.bigdata.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import xyz.maxwells.bigdata.domain.data.IndicatorExplain;

/**
 * Created by wuzusheng on 2018/4/10.
 */
public interface IndicatorExplainRepository extends JpaRepository<IndicatorExplain,String>{
    IndicatorExplain findByIndicator(String name);
}
