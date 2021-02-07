package xyz.maxwells.bigdata.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import xyz.maxwells.bigdata.domain.SysUser;
/**
 * Created by wuzusheng on 2018/3/9.
 */
public interface SysUserRepository  extends JpaRepository<SysUser,Long> {
    SysUser findByUsername(String username);
}
