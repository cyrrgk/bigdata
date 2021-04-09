package xyz.maxwells.bigdata.domain.data;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import java.math.BigDecimal;

/**
 * Created by wuzusheng on 2018/5/8.
 */
@Entity
public class SameCityConsumption {
    @Id
    @Getter
    @Setter
    private String indicator;
    @Column(scale = 1)
    @Getter @Setter private BigDecimal y2017m2;
    @Column(scale = 1)
    @Getter @Setter private BigDecimal y2017m3;
    @Column(scale = 1)
    @Getter @Setter private BigDecimal y2017m4;
    @Column(scale = 1)
    @Getter @Setter private BigDecimal y2017m5;
    @Column(scale = 1)
    @Getter @Setter private BigDecimal y2017m6;
    @Column(scale = 1)
    @Getter @Setter private BigDecimal y2017m7;
    @Column(scale = 1)
    @Getter @Setter private BigDecimal y2017m8;
    @Column(scale = 1)
    @Getter @Setter private BigDecimal y2017m9;
    @Column(scale = 1)
    @Getter @Setter private BigDecimal y2017m10;
    @Column(scale = 1)
    @Getter @Setter private BigDecimal y2017m11;
    @Column(scale = 1)
    @Getter @Setter private BigDecimal y2017m12;
    @Column(scale = 1)
    @Getter @Setter private BigDecimal y2018m1;
    @Column(scale = 1)
    @Getter @Setter private BigDecimal y2018m2;
    @OneToOne
    @Getter @Setter private Analysis analysis;
    @OneToOne
    @Getter @Setter private IndicatorExplain indicatorExplain;
}
