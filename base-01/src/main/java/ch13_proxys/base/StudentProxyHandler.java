package ch13_proxys.base;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * project - 动态代理
 *
 * @author guod
 * @version 1.0
 * @date 日期:2018/10/31 时间:13:02
 * @JDK 1.8
 * @Description 功能模块：实现InvocationHandler接口，定义委托类和代理类的桥梁
 */
public class StudentProxyHandler implements InvocationHandler {
    /**
     * 委托类对象
     */
    private Object targetObj;

    public StudentProxyHandler(Object targetObj) {
        this.targetObj = targetObj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // 代理类可以过滤方法，必须我们控制play方法不被执行
        if (method.getName().equals("play")) {
            System.out.println("====StudentProxy 拦截了 play方法 ==========");
            return null;
        }
        // 代理类可以增强方法，必须在执行方法前打印Log信息
        System.out.println("====打印了一条log，代理类有方法被执行了 ==========");
        // 执行委托类的对应方法
        Object result = method.invoke(targetObj, args);
        return result;
    }
}