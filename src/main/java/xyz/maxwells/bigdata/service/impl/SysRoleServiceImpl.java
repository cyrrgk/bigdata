package xyz.maxwells.bigdata.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import xyz.maxwells.bigdata.dao.SysRoleRepository;
import xyz.maxwells.bigdata.domain.SysRole;
import xyz.maxwells.bigdata.service.SysRoleService;

/**
 * Created by wuzusheng on 2018/3/28.
 */
@Service
@Transactional
public class SysRoleServiceImpl implements SysRoleService {
    @Autowired
    private SysRoleRepository dao;
    @Override
    public SysRole findBynam(String name) {
        return dao.findByName(name);
    }
}
