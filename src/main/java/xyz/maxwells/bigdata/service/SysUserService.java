package xyz.maxwells.bigdata.service;

import xyz.maxwells.bigdata.domain.SysUser;
import xyz.maxwells.bigdata.exception.BigdataException;

/**
 * Created by wuzusheng on 2018/3/15.
 */
public interface SysUserService {
    Boolean save(SysUser user) throws BigdataException;
    SysUser findByName(String name);
    void update(SysUser user) throws BigdataException;
}
