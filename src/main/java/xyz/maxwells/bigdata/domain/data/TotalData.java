package xyz.maxwells.bigdata.domain.data;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

/**
 * Created by wuzusheng on 2018/5/8.
 */
public class TotalData {
    //全国同比数据
    @Setter @Getter private NationalConsumption nationalCurentData;
    //全国环比数据
    @Setter @Getter private LastNationalConsumption lastNationalData;
    //全国同期数据
    @Setter @Getter private SameNationalConsumption sameNationalData;
    //城市同比数据
    @Setter @Getter private CityConsumption cityData;
    //城市环比数据
    @Setter @Getter private LastCityConsumption lastCityData;
    //城市同期数据
    @Setter @Getter private SameCityConsumption sameCityData;
    //农村同比数据
    @Setter @Getter private RuralConsumption ruralData;
    //农村环比数据
    @Setter @Getter private LastRuralConsumption lastRuralData;
    //农村同期数据
    @Setter @Getter private SameRuralConsumption sameRuralData;
}
