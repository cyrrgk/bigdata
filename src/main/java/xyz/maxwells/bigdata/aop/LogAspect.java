package xyz.maxwells.bigdata.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import xyz.maxwells.bigdata.dao.LogRepository;
import xyz.maxwells.bigdata.dao.SysUserRepository;
import xyz.maxwells.bigdata.domain.Log;
import xyz.maxwells.bigdata.domain.SysUser;
import xyz.maxwells.bigdata.exception.BigdataException;

import javax.servlet.http.HttpServletRequest;
import java.lang.reflect.Method;
import java.util.Date;

/**
 * Created by wuzusheng on 2018/4/18.
 */
@Component
@Aspect
public class LogAspect {
    @Autowired
    private LogRepository dao;
    @Pointcut("@annotation(xyz.maxwells.bigdata.aop.UserOperate)")
    public void saveLog(){
    }
    @After(value = "saveLog() && @annotation(operate)",argNames = "joinPoint,operate")
    public void logSave(JoinPoint joinPoint,UserOperate operate)throws BigdataException{
        if (SecurityContextHolder.getContext().getAuthentication().getPrincipal() instanceof String){
            throw  new BigdataException("bigdata_01_006::尚未登录,无法获取当前用户");
        }
        HttpServletRequest request = ((ServletRequestAttributes)RequestContextHolder.getRequestAttributes()).getRequest();
        MethodSignature signature = (MethodSignature)joinPoint.getSignature();
        Method method =signature.getMethod();
        String[] params = signature.getParameterNames();
        SysUser user = (SysUser) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        Log log = new Log();
        if (params == null){
            log.setArgs(" ");
        }else {
            String param = "";
            for (String p:params){
                param = param + p + " ";
            }
            log.setArgs(param);
        }
        log.setDate(new Date());
        log.setUserName(user.getUsername());
        log.setModelName(operate.modelName());
        log.setUser(user);
        log.setLocalId(user.getId());
        log.setOperation(operate.option());
        log.setIp(request.getRemoteAddr());
        dao.save(log);
    }
}
