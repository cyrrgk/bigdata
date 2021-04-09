package xyz.maxwells.bigdata.domain.data;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

/**
 * Created by wuzusheng on 2018/5/8.
 */
public class FontColor {
    @Getter @Setter private BigDecimal nationalSameRate;
    @Getter @Setter private BigDecimal nationalLastRate;
    @Getter @Setter private BigDecimal citySameRate;
    @Getter @Setter private BigDecimal cityLastRate;
    @Getter @Setter private BigDecimal ruralSameRate;
    @Getter @Setter private BigDecimal ruralLastRate;
}
