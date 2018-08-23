package io.renren.common.datasources.annotation;

import java.lang.annotation.*;

/**
 * 多数据源注解
 *
 * @date 2018/8/23
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface DataSource {

    String value() default "";
}
