package xyz.maxwells.bigdata.ctrl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import xyz.maxwells.bigdata.domain.RequestResult;
import xyz.maxwells.bigdata.service.CityConsumptionService;
import xyz.maxwells.bigdata.service.NationalFoodService;
import xyz.maxwells.bigdata.service.RuralConsumptionService;

/**
 * Created by wuzusheng on 2018/4/16.
 */
@RestController
public class OfferData {
    @Autowired
    private NationalFoodService service;
    @Autowired
    private CityConsumptionService cityConsumptionService;
    @Autowired
    private RuralConsumptionService ruralConsumptionService;
    @RequestMapping("/nationalfood")
    public RequestResult findAll(){
        return new RequestResult(service.findall());
    }
    @RequestMapping("/cityconsumption")
    public RequestResult getCityConsumptionData(){
        return new RequestResult(cityConsumptionService.findAll());
    }
    @RequestMapping("/ruralconsumption")
    public RequestResult getRuralConsumptionData(){
        return new RequestResult(ruralConsumptionService.findAll());
    }
}
