package xyz.maxwells.bigdata.aop;

import java.lang.annotation.*;

/**
 * Created by wuzusheng on 2018/4/18.
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface UserOperate {
    String modelName() default "";
    String option() default "";
}
