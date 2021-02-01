package xyz.maxwells.bigdata.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "user")
public class User {
    private String name;
    @Id
    private Long id;
}
