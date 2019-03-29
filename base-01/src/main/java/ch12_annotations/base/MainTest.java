package ch12_annotations.base;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

/**
 * project -
 *
 * @author guod
 * @version 1.0
 * @date 日期:2018/7/4 时间:8:08
 * @JDK 1.8
 * @Description 功能模块：
 */
public class MainTest {
    public static void main(String[] args) throws Exception {
        Class<?> aClass = Class.forName("ch12_annotations.hibernate.UserEntity");
        Annotation[] annotations = aClass.getAnnotations();
        System.out.println(annotations.length);
        Field[] declaredFields = aClass.getDeclaredFields();
    }
}