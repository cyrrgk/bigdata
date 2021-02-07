package xyz.maxwells.bigdata.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
/**
 * Created by wuzusheng on 2018/3/9.
 */
@Data
@Entity
public class SysRole {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
}

