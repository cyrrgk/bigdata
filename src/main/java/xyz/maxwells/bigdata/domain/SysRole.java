package xyz.maxwells.bigdata.domain;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
/**
 * Created by wuzusheng on 2018/3/9.
 */
@Entity
@ToString
public class SysRole {
    @Id
    @GeneratedValue
    @Setter @Getter private Long id;
    @Column(nullable = false,unique = true)
    @Setter @Getter private String name;
}

