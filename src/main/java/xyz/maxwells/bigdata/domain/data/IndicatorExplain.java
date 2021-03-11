package xyz.maxwells.bigdata.domain.data;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by wuzusheng on 2018/4/10.
 */
@Entity
public class IndicatorExplain {
    @Id
    @Getter @Setter private String indicator;
    @Getter @Setter private String explaination;
}
