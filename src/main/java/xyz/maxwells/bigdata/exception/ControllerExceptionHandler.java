package xyz.maxwells.bigdata.exception;

import org.springframework.http.HttpStatus;
import org.springframework.validation.BindException;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import xyz.maxwells.bigdata.domain.RequestResult;

import java.util.List;

/**
 * Created by wuzusheng on 2018/3/10.
 */


//统一异常处理
@ControllerAdvice
public class ControllerExceptionHandler {
    @ExceptionHandler(BigdataException.class)
    @ResponseBody
    public RequestResult handle(BigdataException ex){
        return new RequestResult(ex);
    }

    @ExceptionHandler(BindException.class)
    @ResponseBody
    public RequestResult handleBindException(BindException ex){
        return new RequestResult(new BigdataException(ex.getAllErrors().get(0).getDefaultMessage()));
    }
}
