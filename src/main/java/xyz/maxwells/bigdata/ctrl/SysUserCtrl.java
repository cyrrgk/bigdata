package xyz.maxwells.bigdata.ctrl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import xyz.maxwells.bigdata.aop.UserOperate;
import xyz.maxwells.bigdata.domain.*;
import xyz.maxwells.bigdata.exception.BigdataException;
import xyz.maxwells.bigdata.service.SysUserService;

/**
 * Created by wuzusheng on 2018/3/15.
 */
@RestController
@RequestMapping("/user")
public class SysUserCtrl {
    @Autowired
    private SysUserService service;
    //注册
    @RequestMapping("/save")
    public RequestResult save(@Validated UserSaveDTO dto)throws BigdataException{
        SysUser user = new SysUser();
        user.setUsername(dto.getUsername());
        user.setPassword(dto.getPassword());
        user.setEmail(dto.getEmail());
        user.setPhone(dto.getPhone());
        SysRole role = new SysRole();
        role.setId(1L);
        role.setName("ROLE_USER");
        user.getRoles().add(role);
        if (service.save(user)){
            return new RequestResult();
        }
        return new RequestResult(false);
    }
    //查询登录用户信息
    @RequestMapping("/find")
    public RequestResult findByName()throws BigdataException{
        if (SecurityContextHolder.getContext().getAuthentication().getPrincipal() instanceof String){
             throw new BigdataException("bigdata_01_006::尚未登录,无法获取当前用户");
        }
        SysUser securityUser = (SysUser) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        SysUser user  = service.findByName(securityUser.getUsername());
        user.setPassword(null);
        return new RequestResult(user);
    }
    @UserOperate(modelName = "用户操作模块",option = "修改密码")
    //修改个人密码
    @RequestMapping("/change")
    public RequestResult changePassword(String oldPass,String rePass)throws BigdataException{
        if (SecurityContextHolder.getContext().getAuthentication().getPrincipal() instanceof String){
            throw new BigdataException("bigdata_01_006::尚未登录,无法获取当前用户");
        }
        SysUser securityUser = (SysUser) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        SysUser user  = service.findByName(securityUser.getUsername());
        if (!oldPass.equals(user.getPassword())){
            throw new BigdataException("bigdata_02_004::原密码不正确");
        }
        user.setPassword(rePass);
        service.update(user);
        return new RequestResult();
    }
    //修改个人信息
    @UserOperate(modelName = "用户操作模块",option = "修改个人信息")
    @RequestMapping("/updateown")
    public RequestResult updateOwnMsg(@Validated UserOwnMsgUpdate dto) throws BigdataException{
        if (SecurityContextHolder.getContext().getAuthentication().getPrincipal() instanceof String){
            throw new BigdataException("bigdata_01_006::尚未登录,无法获取当前用户");
        }
        SysUser securityUser = (SysUser) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        SysUser user  = service.findByName(securityUser.getUsername());
        if (service.findByName(dto.getName())!=null){
                throw new BigdataException("bigdata_03_003::用户名重复");
        }
        user.setUsername(dto.getName());
        user.setPhone(dto.getCellphone());
        user.setEmail(dto.getEmail());
        service.update(user);
        return new RequestResult();
    }
    //查询所有用户
    @UserOperate(modelName = "用户管理模块",option = "查询用户")
    @RequestMapping("/findall")
    public RequestResult findAll() throws BigdataException{
        return new RequestResult(service.findAll());
    }
    //修改用户信息
    @UserOperate(modelName = "用户管理模块",option = "修改用户信息")
    @RequestMapping("/update")
    public RequestResult update(Long id,String username,String email,Long phone)throws BigdataException{
        SysUser sysUser = service.findOne(id);
        if (!username.equals(sysUser.getUsername())){
            if (service.findByName(username)!=null){
                throw new BigdataException("bigdata_03_003::用户名重复");
            }
        }
        sysUser.setUsername(username);
        sysUser.setEmail(email);
        sysUser.setPhone(phone);
        service.update(sysUser);
        return new RequestResult();
    }
    @UserOperate(modelName = "用户管理模块",option = "查询用户信息")
    @RequestMapping("/list")
    public RequestResult list(UserFindAllDTO dto,VuePageable pageable){
        Page<SysUser> page = service.list(UserFindAllDTO.getSpecification(dto),pageable.getPageable());
        return new RequestResult(page);
    }
    @UserOperate(modelName = "用户管理模块",option = "删除用户")
    @RequestMapping("/delete")
    public RequestResult delete(Long id){
        service.delete(id);
        return new RequestResult();
    }

}
