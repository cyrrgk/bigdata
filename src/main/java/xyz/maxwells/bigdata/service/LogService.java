package xyz.maxwells.bigdata.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import xyz.maxwells.bigdata.domain.Log;

/**
 * Created by wuzusheng on 2018/4/19.
 */
public interface LogService {
    Page<Log> list(Specification<Log> spec, Pageable pageable);
}
