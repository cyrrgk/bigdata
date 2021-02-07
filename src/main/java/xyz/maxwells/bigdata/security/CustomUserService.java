package xyz.maxwells.bigdata.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import xyz.maxwells.bigdata.dao.SysUserRepository;
import xyz.maxwells.bigdata.domain.SysUser;
/**
 * Created by wuzusheng on 2018/3/9.
 */
public class CustomUserService implements UserDetailsService{
    @Autowired
    SysUserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        SysUser user = userRepository.findByUsername(username);
        if (user == null){
            throw new UsernameNotFoundException("用户名不存在");
        }
        return user;
    }
}
