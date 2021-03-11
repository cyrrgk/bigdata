package xyz.maxwells.bigdata.ctrl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import xyz.maxwells.bigdata.domain.RequestResult;
import xyz.maxwells.bigdata.service.IndicatorExplainService;

/**
 * Created by wuzusheng on 2018/4/10.
 */
@RestController
@RequestMapping("/indicator")
public class IndicatorExplainCtrl {
    @Autowired
    private IndicatorExplainService service;
    @RequestMapping("/find")
    public RequestResult findOne(String name){
        String indicator;
        if (name != null && !"".equals(name)){
            int index = name.indexOf("(");
            if (index != -1){
                indicator = name.substring(0,index);
                return new RequestResult(service.findByName(indicator));
            }

        }
        return new RequestResult(false);
    }

}
