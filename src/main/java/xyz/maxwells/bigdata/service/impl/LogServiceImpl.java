package xyz.maxwells.bigdata.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import xyz.maxwells.bigdata.dao.LogRepository;
import xyz.maxwells.bigdata.domain.Log;
import xyz.maxwells.bigdata.service.LogService;

/**
 * Created by wuzusheng on 2018/4/19.
 */
@Service
public class LogServiceImpl implements LogService{
    @Autowired
    private LogRepository dao;
    @Override
    public Page<Log> list(Specification<Log> spec, Pageable pageable) {
        return dao.findAll(spec,pageable);
    }
}
