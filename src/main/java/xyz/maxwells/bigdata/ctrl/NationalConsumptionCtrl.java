package xyz.maxwells.bigdata.ctrl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import xyz.maxwells.bigdata.domain.RequestResult;
import xyz.maxwells.bigdata.service.NationalConsumptionService;

/**
 * Created by wuzusheng on 2018/4/1.
 */
@RestController
@RequestMapping("/consumption")
public class NationalConsumptionCtrl {
    @Autowired
    private NationalConsumptionService service;
    @RequestMapping("/findall")
    public RequestResult findAll(){
        return new RequestResult(service.findAll());
    }
}
