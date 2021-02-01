package xyz.maxwells.bigdata.ctrl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import xyz.maxwells.bigdata.domain.User;
import xyz.maxwells.bigdata.service.UserService;

import java.util.List;

@RestController
public class UserCtrl {
    @Autowired
    private UserService service;
    @RequestMapping("/test")
    public List<User> test(){
        return service.findall();
    }
}
