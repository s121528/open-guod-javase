package ch12_annotation.hibernate;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * project -
 *
 * @author guodd
 * @version 1.0
 * @date 日期:2018/9/12 时间:21:36
 * @JDK 1.8
 * @Description 功能模块：表的别名
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface SetTable {
    String value();
}