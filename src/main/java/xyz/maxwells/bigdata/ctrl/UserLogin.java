package xyz.maxwells.bigdata.ctrl;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import xyz.maxwells.bigdata.aop.UserOperate;
import xyz.maxwells.bigdata.domain.RequestResult;
import xyz.maxwells.bigdata.domain.SysUser;
import xyz.maxwells.bigdata.exception.BigdataException;

/**
 * Created by wuzusheng on 2018/3/9.
 */
@CrossOrigin
@RestController
public class UserLogin {
    @UserOperate(modelName = "用户操作模块",option = "登录")
    @RequestMapping("/succeed")
    public RequestResult succeed(){
        //判断是否登录成功
        if (SecurityContextHolder.getContext().getAuthentication().getPrincipal() instanceof String){
            return new RequestResult(new BigdataException("bigdata_01_006::尚未登录,无法获取当前用户"));
        }
        //返回该用户信息
        SysUser user = (SysUser) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        return new RequestResult(user);
    }
    @RequestMapping("/login_page")
    public RequestResult loginPage() {
        return new RequestResult(new BigdataException("bigdata_01_005::尚未登录，请登录!"));
    }
    @UserOperate(modelName = "用户操作模块",option = "注销")
    @RequestMapping("/logoutsucceed")
    public RequestResult logout(){
        return new RequestResult("注销成功");
    }
//获取当前用户名
    @RequestMapping("/getuser")
    public RequestResult getuser(){
        if (SecurityContextHolder.getContext().getAuthentication().getPrincipal() instanceof String){
            return new RequestResult(new BigdataException("bigdata_01_006::尚未登录,无法获取当前用户"));
        }
        SysUser user = (SysUser) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        return new RequestResult(user.getUsername());
    }

    @RequestMapping("/test")
    @UserOperate(option = "666")
    public String test() throws BigdataException{
//        throw new BigdataException("123::error");
        return "test!";
    }
}
