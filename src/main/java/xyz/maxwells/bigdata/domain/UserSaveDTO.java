package xyz.maxwells.bigdata.domain;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;

/**
 * Created by wuzusheng on 2018/3/15.
 */

public class UserSaveDTO {
    @NotNull(message = "bigdata_02_001::用户名不能为空")
    @Getter @Setter private String username;
    @NotNull(message = "bigdata_02_002::密码不能为空")
    @Getter @Setter private String password;
    @Getter @Setter private String email;
    @Getter @Setter private Long phone;

}
