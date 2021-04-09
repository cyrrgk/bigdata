package xyz.maxwells.bigdata.ctrl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import xyz.maxwells.bigdata.domain.RequestResult;
import xyz.maxwells.bigdata.domain.data.*;
import xyz.maxwells.bigdata.service.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by wuzusheng on 2018/4/16.
 */
@RestController
public class OfferDataCtrl {
    @Autowired
    private NationalConsumptionService nationalConsumptionService;
    @Autowired
    private NationalFoodService service;
    @Autowired
    private CityConsumptionService cityConsumptionService;
    @Autowired
    private RuralConsumptionService ruralConsumptionService;
    @Autowired
    private SameNationalConsumptionService sameNationalConsumptionService;
    @Autowired
    private SameNationalFoodService sameNationalFoodService;
    @Autowired
    private SameCityConsumptionService sameCityConsumptionService;
    @Autowired
    private SameRuralConsumptionService sameRuralConsumptionService;
    @Autowired
    private LastNationalConsumptionService lastNationalConsumptionService;
    @Autowired
    private LastNationalFoodService lastNationalFoodService;
    @Autowired
    private LastCityConsumptionService lastCityConsumptionService;
    @Autowired
    private LastRuralConsumptionService lastRuralConsumptionService;
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
    @RequestMapping("/consumption/findall")
    public RequestResult getNationalConsumptionData(){
        return new RequestResult(nationalConsumptionService.findAll());
    }
    @RequestMapping("/SameNationalConsumption")
    public RequestResult getSameNationalConsumptionData(){
        return new RequestResult(sameNationalConsumptionService.findAll());
    }
    @RequestMapping("/sameNationalFood")
    public RequestResult getSameNationalFoodData(){
        return new RequestResult(sameNationalFoodService.findAll());
    }
    @RequestMapping("/sameCityConsumption")
    public RequestResult getSameCityConsumptionData(){
        return new RequestResult(sameCityConsumptionService.findAll());
    }
    @RequestMapping("/sameRuralConsumption")
    public RequestResult getSameRuralConsumptionData(){
        return new RequestResult(sameRuralConsumptionService.findAll());
    }
    @RequestMapping("/lastNationalConsumption")
    public RequestResult getLastNationalConsumptionData(){
        return new RequestResult(lastNationalConsumptionService.findAll());
    }
    @RequestMapping("/lastNationalFood")
    public RequestResult getLastNationalFoodData(){
        return new RequestResult(lastNationalFoodService.findAll());
    }
    @RequestMapping("/lastCityConsumption")
    public RequestResult getLastCityConsumptionData(){
        return new RequestResult(lastCityConsumptionService.findAll());
    }
    @RequestMapping("/lastRuralConsumption")
    public RequestResult getLastRuralConsumptionData(){
        return new RequestResult(lastRuralConsumptionService.findAll());
    }
    @RequestMapping("/totalData")
    public RequestResult getTotalData(){
        //全国同比数据
        NationalConsumption nationalCurentData = nationalConsumptionService.findAll().get(0);
        //全国环比数据
        LastNationalConsumption lastNationalData = lastNationalConsumptionService.findAll().get(0);
        //全国同期数据
        SameNationalConsumption sameNationalData = sameNationalConsumptionService.findAll().get(0);
        //城市同比数据
        CityConsumption cityData = cityConsumptionService.findAll().get(0);
        //城市环比数据
        LastCityConsumption lastCityData = lastCityConsumptionService.findAll().get(0);
        //城市同期数据
        SameCityConsumption sameCityData = sameCityConsumptionService.findAll().get(0);
        //农村同比数据
        RuralConsumption ruralData = ruralConsumptionService.findAll().get(0);
        //农村环比数据
        LastRuralConsumption lastRuralData = lastRuralConsumptionService.findAll().get(0);
        //农村同期数据
        SameRuralConsumption sameRuralData = sameRuralConsumptionService.findAll().get(0);
        TotalData totalData = new TotalData();
        totalData.setNationalCurentData(nationalCurentData);
        totalData.setLastNationalData(lastNationalData);
        totalData.setSameNationalData(sameNationalData);
        totalData.setCityData(cityData);
        totalData.setLastCityData(lastCityData);
        totalData.setSameCityData(sameCityData);
        totalData.setRuralData(ruralData);
        totalData.setLastRuralData(lastRuralData);
        totalData.setSameRuralData(sameRuralData);
        return new RequestResult(totalData);
    }

}
