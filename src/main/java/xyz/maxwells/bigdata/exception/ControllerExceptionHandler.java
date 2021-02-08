package xyz.maxwells.bigdata.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import xyz.maxwells.bigdata.domain.RequestResult;

/**
 * Created by wuzusheng on 2018/3/10.
 */


//统一异常处理
@ControllerAdvice
public class ControllerExceptionHandler {
    @ExceptionHandler(BigdataException.class)
    @ResponseBody
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public RequestResult handle(BigdataException ex){
        return new RequestResult(ex);
    }
}
