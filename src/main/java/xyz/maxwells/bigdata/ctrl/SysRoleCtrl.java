package xyz.maxwells.bigdata.ctrl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import xyz.maxwells.bigdata.aop.UserOperate;
import xyz.maxwells.bigdata.domain.ChangePerssion;
import xyz.maxwells.bigdata.domain.RequestResult;
import xyz.maxwells.bigdata.domain.SysRole;
import xyz.maxwells.bigdata.domain.SysUser;
import xyz.maxwells.bigdata.exception.BigdataException;
import xyz.maxwells.bigdata.service.SysRoleService;
import xyz.maxwells.bigdata.service.SysUserService;

import java.util.List;

/**
 * Created by wuzusheng on 2018/3/28.
 */
@RestController
@RequestMapping("/role")
public class SysRoleCtrl {
    @Autowired
    private SysUserService sysUserService;
    @Autowired
    private SysRoleService sysRoleService;
    //用户角色的分配
    @UserOperate(modelName = "权限分配模块",option = "分配角色")
    @RequestMapping("/perssion")
    public RequestResult changePerssion(ChangePerssion perssion) throws BigdataException{
        SysUser user = sysUserService.findOne(perssion.getId());
        user.setEnabled(perssion.getEnable());
        if (user.getRoles().size() >0 && user.getRoles().get(0).getName().equals(perssion.getRole())){
            sysUserService.update(user);
        }else {
            user.getRoles().clear();
            user.getRoles().add(sysRoleService.findBynam(perssion.getRole()));
            sysUserService.update(user);
        }
        return new RequestResult();
    }
}
