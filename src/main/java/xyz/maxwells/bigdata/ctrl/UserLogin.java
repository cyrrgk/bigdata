package xyz.maxwells.bigdata.ctrl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * Created by wuzusheng on 2018/3/9.
 */
@RestController
public class UserLogin {
    @RequestMapping("/loginerror")
    public String say(){
        return "错误页面!";
    }
    @RequestMapping("/succeed")
    public String succeed(){
        return "成功页面!";
    }
    @RequestMapping("/login_page")
    public String loginPage() {
        return "尚未登录，请登录!";
    }
    @RequestMapping("/logoutsucceed")
    public String logout(){
        return "注销成功！";
    }
    @RequestMapping("/test")
    public String test(){
        return "test!";
    }
}
