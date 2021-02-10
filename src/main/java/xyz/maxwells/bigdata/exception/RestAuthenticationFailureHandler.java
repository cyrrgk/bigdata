package xyz.maxwells.bigdata.exception;

import com.alibaba.fastjson.JSON;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;
import xyz.maxwells.bigdata.domain.RequestResult;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by wuzusheng on 2018/3/10.
 */
public class RestAuthenticationFailureHandler implements AuthenticationFailureHandler {
    @Override
    public void onAuthenticationFailure(HttpServletRequest httpServletRequest, HttpServletResponse resp, AuthenticationException e) throws IOException, ServletException {
        resp.setContentType("application/json;charset=utf-8");
        PrintWriter writer = resp.getWriter();
        if (e instanceof BadCredentialsException){
            writer.println(JSON.toJSONString(new RequestResult(new BigdataException("bigdata_01_002::用户名或密码错误"))));
        }else if (e instanceof DisabledException){
            writer.println(JSON.toJSONString(new RequestResult(new BigdataException("bigdata_01_003::账户已被禁用，恢复请联系管理员"))));
        }else {
            writer.println(JSON.toJSONString(new RequestResult(new BigdataException("bigdata_01_004::登录失败"))));
        }

    }
}
