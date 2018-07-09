package com.sy.annotation;

import java.lang.annotation.*;

/**
 * 用来指定fmxl配置文件的名字，默认是类名
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
@Documented
public @interface VIEW {
    public String name() default "className";
}
