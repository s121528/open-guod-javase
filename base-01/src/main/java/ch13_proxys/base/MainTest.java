package ch13_proxys.base;

import java.lang.reflect.Proxy;

/**
 * project - 动态代理
 *
 * @author guod
 * @version 1.0
 * @date 日期:2018/10/31 时间:13:04
 * @JDK 1.8
 * @Description 功能模块：
 */
public class MainTest {
    public static void main(String[] args) {
        // 创建委托类对象
        Student student = new Student();
        // 生成代理类对象Proxy.newProxyInstance();
        StudentInterface proxyInstance = (StudentInterface) Proxy.newProxyInstance(
                StudentInterface.class.getClassLoader(),
                new Class[]{StudentInterface.class}, new StudentProxyHandler(student));
        // 调用代理类的方法
        proxyInstance.study();
        proxyInstance.sleep();
        proxyInstance.play();
        // 代理对象的名字
        System.out.println(proxyInstance.getClass().getName());
    }
}