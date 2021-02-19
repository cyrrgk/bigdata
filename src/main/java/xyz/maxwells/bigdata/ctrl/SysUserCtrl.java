package xyz.maxwells.bigdata.ctrl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import xyz.maxwells.bigdata.domain.RequestResult;
import xyz.maxwells.bigdata.domain.SysUser;
import xyz.maxwells.bigdata.domain.UserOwnMsgUpdate;
import xyz.maxwells.bigdata.domain.UserSaveDTO;
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
    @RequestMapping("/save")
    public RequestResult save(@Validated UserSaveDTO dto)throws BigdataException{
        SysUser user = new SysUser();
        user.setUsername(dto.getUsername());
        user.setPassword(dto.getPassword());
        user.setEmail(dto.getEmail());
        user.setPhone(dto.getPhone());
        if (service.save(user)){
            return new RequestResult();
        }
        return new RequestResult(false);
    }
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
}
