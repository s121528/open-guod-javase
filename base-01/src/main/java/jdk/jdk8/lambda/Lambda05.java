package jdk.jdk8.lambda;

/**
 * project -
 *
 * @author guodd
 * @version 1.0
 * @date 日期:2018/9/23 时间:11:52
 * @JDK 1.8
 * @Description 功能模块：
 */
public class Lambda05 {
    public static void main(String[] args) {
        String fun = fun((s1) -> {
            String s = s1.toUpperCase();
            System.out.println(s);
            return s;
        });
        System.out.println(fun);

        fun02(new UserAble() {
            @Override
            void user() {
                System.out.println("test");
            }
        });
    }

    public static String fun(Images images) {
        String print = images.print("hello world");
        return print;
    }

    public static void fun02(UserAble userAble) {
        userAble.user();
        userAble.user02();
    }
}

@FunctionalInterface
interface Images {
    String print(String s);
}

abstract class UserAble {
    abstract void user();

    void user02() {
        System.out.println("java");
    }
}