package xyz.maxwells.bigdata.domain;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;

/**
 * Created by wuzusheng on 2018/3/28.
 */
public class ChangePerssion {
    @NotNull(message = "bigdata_04_001::用户ID不能为空")
    @Setter @Getter private Long id;
    @NotNull(message = "bigdata_04_002::角色不能为空")
    @Setter @Getter private String role;
    @NotNull(message = "bigdata_04_003::账户状态不能为空")
    @Setter @Getter private Boolean enable;

}
