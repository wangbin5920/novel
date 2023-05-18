package com.wangbin.novel.core.annotation;

import com.wangbin.novel.core.common.constant.ErrorCodeEnum;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * 分布式锁 注解
 *
 * @author wangbin
 * @date 2023/6/20
 */
@Documented
@Retention(RUNTIME)
@Target(METHOD)
public @interface Lock {

    String prefix();

    boolean isWait() default false;

    long waitTime() default 3L;

    ErrorCodeEnum failCode() default ErrorCodeEnum.OK;

}
