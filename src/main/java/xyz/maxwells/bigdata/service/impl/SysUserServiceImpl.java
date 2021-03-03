package xyz.maxwells.bigdata.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import xyz.maxwells.bigdata.dao.SysUserRepository;
import xyz.maxwells.bigdata.domain.SysUser;
import xyz.maxwells.bigdata.exception.BigdataException;
import xyz.maxwells.bigdata.service.SysUserService;

import java.util.List;

/**
 * Created by wuzusheng on 2018/3/15.
 */
@Service
@Transactional
public class SysUserServiceImpl implements SysUserService {
    @Autowired
    private SysUserRepository dao;
    @Override
    public Boolean save(SysUser user)throws BigdataException {
        if (dao.findByUsername(user.getUsername())!=null){
            throw new BigdataException("bigdata_02_003::用户名重复");
        }
        return dao.save(user)!=null;
    }

    @Override
    public SysUser findByName(String name) {
        return dao.findByUsername(name);
    }

    @Override
    public void update(SysUser user) throws BigdataException {
        dao.save(user);
    }

    @Override
    public List<SysUser> findAll() throws BigdataException {
        return dao.findAll();
    }

    @Override
    public SysUser findOne(Long id) {
        return dao.findOne(id);
    }

    @Override
    public Page<SysUser> list(Specification<SysUser> spec, Pageable pageable) {
        return dao.findAll(spec,pageable);
    }

    @Override
    public void delete(Long id) {
        dao.delete(id);
    }
}
