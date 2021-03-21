package xyz.maxwells.bigdata.domain.data;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * Created by wuzusheng on 2018/4/15.
 */
@Entity
public class Analysis {
    @Id @Column(nullable = false,unique = true)
    @Getter @Setter private String indicator;
    @Getter @Setter private String analysis;
}
