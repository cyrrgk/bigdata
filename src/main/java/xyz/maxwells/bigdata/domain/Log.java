package xyz.maxwells.bigdata.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by wuzusheng on 2018/4/18.
 */
@Entity
public class Log {
    @Id
    @GeneratedValue
    @Getter @Setter private Long id;
    @OneToOne
    @Getter @Setter private SysUser user;
    @Getter @Setter private String modelName;
    @Getter @Setter private String userName;
    @Getter @Setter private String operation;
    @Getter @Setter private String args;
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    @Getter @Setter private Date date;
    @Getter @Setter private String ip;
    @Getter @Setter private Long localId;
}
