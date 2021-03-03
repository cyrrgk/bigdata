package xyz.maxwells.bigdata.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

/**
 * Created by wuzusheng on 2018/3/17.
 */
@Entity
public class ProductsMonth {
    @Id
    @Getter @Setter private String indicator;
    @Column(scale = 1)
    @Getter @Setter private BigDecimal y2016s3;
    @Column(scale = 1)
    @Getter @Setter private BigDecimal y2016s4;
    @Column(scale = 1)
    @Getter @Setter private BigDecimal y2017s1;
    @Column(scale = 1)
    @Getter @Setter private BigDecimal y2017s2;
    @Column(scale = 1)
    @Getter @Setter private BigDecimal y2017s3;
    @Column(scale = 1)
    @Getter @Setter private BigDecimal y2017s4;
}
