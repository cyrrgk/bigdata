package xyz.maxwells.bigdata.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import xyz.maxwells.bigdata.domain.SysRole;

/**
 * Created by wuzusheng on 2018/3/28.
 */
public interface SysRoleRepository extends JpaRepository<SysRole,Long>{
    SysRole findByName(String name);
}
