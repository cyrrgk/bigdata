package xyz.maxwells.bigdata.domain;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Email;

import javax.validation.constraints.NotNull;

/**
 * Created by wuzusheng on 2018/3/21.
 */
public class UserOwnMsgUpdate {
    @NotNull(message = "bigdata_03_001::用户名不能为空")
    @Setter @Getter String name;
    @Setter @Getter Long cellphone;
    @Email(message = "bigdata_03_002::邮箱格式不正确")
    @Setter @Getter String email;
}
