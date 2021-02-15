package xyz.maxwells.bigdata.ctrl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import xyz.maxwells.bigdata.domain.RequestResult;
import xyz.maxwells.bigdata.domain.SysUser;
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
}
