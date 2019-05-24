package jdk.jdk8.lambda;

/**
 * project - lambda表达式
 *
 * @author guod
 * @version 1.0
 * @date 日期:2018/11/5 时间:14:28
 * @JDK 1.8
 * @Description 功能模块：静态方法引用
 * 语法格式：类名称::静态方法名称（x->String.valueOf(x)）
 */
public class LambdaMethodTestMain01 {
    public static void main(String[] args) {
        // 即：将String.valueOf()方法转换成了Method01接口里面的zhuanHuan方法
        Method01<Integer, String> msg01 = e -> String.valueOf(e);
        Method01<Integer, String> msg02 = String::valueOf;
        System.out.println(msg01.zhuanHuan(1000).replaceAll("0", "9"));
        System.out.println(msg02.zhuanHuan(1000).replaceAll("0", "9"));
    }
}

/**
 * @param <P>引用方法的参数类型
 * @param <R>引用方法的返回类型
 */
@FunctionalInterface
interface Method01<P, R> {
    R zhuanHuan(P p);
}
