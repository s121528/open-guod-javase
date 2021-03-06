package ch09_annotation.base;

import java.lang.annotation.*;

/**
 * 01、@Documented：指定被标注的注解会包含在javadoc中。
 * 02、@Retention：指定注解的生命周期（源码、class文件、运行时），其参考值见类的定义：{@link RetentionPolicy}
 * 03、@Target：指定注解使用的目标范围（类、方法、字段等），其参考值见类的定义：{@link ElementType}
 * 04、@Inherited：指定子类可以继承父类的注解，只能是类上的注解，方法和字段的注解不能继承。即如果父类上的注解是@Inherited修饰的就能被子类继承。
 * <p>1.8新增注解
 * 05、@Repeatable：注解上可以使用重复注解，即可以在一个地方可以重复使用同一个注解，像spring中的包扫描注解就使用了这个。
 * 06、@Native：指定字段是一个常量，其值引用native code。
 *
 * @author guod
 * @version 1.0
 * @since 1.8
 */
@Documented
@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
public @interface MyAnnotation {

    String name() default "";

    String website() default "hello";

    int revision() default 1;
}
