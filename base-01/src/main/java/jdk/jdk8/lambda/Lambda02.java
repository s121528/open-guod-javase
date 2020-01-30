package jdk.jdk8.lambda;

/**
 * project - lambda表达式的本质是作为函数式接口的实例！！！
 *
 * @author guod
 * @version 1.0
 * @date 日期:2018/11/5 时间:13:54
 * @JDK 1.8
 * @Description 功能模块：取代匿名内部类的方式lambda表达式，无参，无返回值。
 */
public class Lambda02 {
    public static void main(String[] args) {
        Lambda02.fun(
                () -> {
                    System.out.println("lambda表达式");
                }
        );
    }

    private static void fun(Movable02 movable02) {
        movable02.move();
    }
}

interface Movable02 {
    void move();
}