package xyz.maxwells.bigdata.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import xyz.maxwells.bigdata.domain.SysUser;
/**
 * Created by wuzusheng on 2018/3/9.
 */
public interface SysUserRepository  extends JpaRepository<SysUser,Long>,JpaSpecificationExecutor<SysUser> {
    SysUser findByUsername(String username);
}
