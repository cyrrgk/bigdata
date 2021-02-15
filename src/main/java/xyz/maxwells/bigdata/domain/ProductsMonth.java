package xyz.maxwells.bigdata.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by wuzusheng on 2018/3/17.
 */
@Entity
public class ProductsMonth {
    @Id
    @Getter @Setter private String indicator;
    @Getter @Setter private Long y2017s4;
    @Getter @Setter private Long y2017s3;
    @Getter @Setter private Long y2017s2;
    @Getter @Setter private Long y2017s1;
    @Getter @Setter private Long y2016s4;
    @Getter @Setter private Long y2016s3;
}
