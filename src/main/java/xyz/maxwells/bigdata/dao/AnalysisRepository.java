package xyz.maxwells.bigdata.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import xyz.maxwells.bigdata.domain.data.Analysis;

/**
 * Created by wuzusheng on 2018/4/16.
 */
public interface AnalysisRepository extends JpaRepository<Analysis,String> {
    Analysis findByIndicator(String indicator);
}
