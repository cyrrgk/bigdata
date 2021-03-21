package xyz.maxwells.bigdata.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import xyz.maxwells.bigdata.domain.Log;

/**
 * Created by wuzusheng on 2018/4/19.
 */
public interface LogRepository extends JpaRepository<Log,Long>,JpaSpecificationExecutor<Log> {
}
