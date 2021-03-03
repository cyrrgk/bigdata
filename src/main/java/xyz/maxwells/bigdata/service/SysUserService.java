package xyz.maxwells.bigdata.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import xyz.maxwells.bigdata.domain.SysUser;
import xyz.maxwells.bigdata.exception.BigdataException;

import java.util.List;

/**
 * Created by wuzusheng on 2018/3/15.
 */
public interface SysUserService {
    Boolean save(SysUser user) throws BigdataException;
    SysUser findByName(String name);
    void update(SysUser user) throws BigdataException;
    List<SysUser>findAll()throws BigdataException;
    SysUser findOne(Long id);
    Page<SysUser> list(Specification<SysUser> spec, Pageable pageable);
    void delete(Long id);
}
