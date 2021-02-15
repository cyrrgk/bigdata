package xyz.maxwells.bigdata.domain;

import xyz.maxwells.bigdata.exception.BigdataException;
import xyz.maxwells.bigdata.exception.ErrorMessage;

import java.util.HashMap;
/**
 * Created by wuzusheng on 2018/3/9.
 */
public class RequestResult extends HashMap<String,Object> {
    public RequestResult() {
        this.put("success",true);
    }
    public RequestResult(Boolean res) {
        this.put("success",res);
    }

    public RequestResult(BigdataException msg){
        this.put("success",false);
        this.put("error",new ErrorMessage(msg));
    }

    public RequestResult(Object result) {
        this.put("success",true);
        this.put("result",result);
    }
}
