package ch11_reflection.classobject;

import ch11_reflection.method.User;

/**
 * project - 反射
 *
 * @author guod
 * @version 1.0
 * @date 日期:2018/9/19 时间:8:03
 * @JDK 1.8
 * @Description 功能模块：JAVA反射机制是在运行状态中，
 * 对于任意一个类，都能够知道这个类的所有属性和方法；
 * 对于任意一个对象，都能够调用它的任意一个方法；
 * 这种动态获取的信息以及动态调用对象的方法的功能称为java语言的反射机制。
 * 注意：反射可以调用没有暴露出来的API
 */
public class GetClass {
    public static void main(String[] args) throws Exception {
        // 静态加载：在编译时期加载的类，叫静态加载
        // 动态加载：在运行时期加载的类，叫动态加载
        // 第一种：Class.forName（"类名"）
        System.out.println(User.class.getName());
        Class<?> aClass1 = Class.forName("ch11_reflection.method.User");
        System.out.println("Class.forName()方式 ：" + aClass1);
        // 第二种：对象.getClass()方法
        User user = new User();
        Class<? extends User> aClass2 = user.getClass();
        System.out.println("对象.getClass()方式 ：" + aClass2 + ", " + (aClass1 == aClass2));
        // 第三种：类名.class方法
        Class<User> aClass3 = User.class;
        System.out.println("类名.class方式 ：" + aClass3 + ", " + (aClass1 == aClass3));
    }
}