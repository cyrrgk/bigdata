package xyz.maxwells.bigdata.domain;

import java.util.HashMap;
/**
 * Created by wuzusheng on 2018/3/9.
 */
public class RequestResult extends HashMap<String,Object> {
    public RequestResult() {
        this.put("success",true);
    }

    public RequestResult(String reeorMsg){
        this.put("success",false);
        this.put("result",reeorMsg);
    }

    public RequestResult(Object result) {
        this.put("success",true);
        this.put("result",result);
    }
}
