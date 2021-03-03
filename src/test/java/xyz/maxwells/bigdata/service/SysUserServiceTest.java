package xyz.maxwells.bigdata.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import xyz.maxwells.bigdata.BigdataApplication;
import xyz.maxwells.bigdata.domain.SysRole;
import xyz.maxwells.bigdata.domain.SysUser;

import static org.junit.Assert.*;

/**
 * Created by wuzusheng on 2018/3/27.
 */
@RunWith(SpringRunner.class)
@WebAppConfiguration
@SpringBootTest(classes = BigdataApplication.class,webEnvironment = SpringBootTest.WebEnvironment.MOCK)

public class SysUserServiceTest {
//    @Autowired
//    private SysUserService service;
    @Autowired
    private SysRoleService service;
    @Test
    public void save() throws Exception {
        System.out.println(service.findBynam("ROLE_ADMIN"));
    }

}