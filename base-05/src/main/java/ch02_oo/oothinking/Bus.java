package ch02_oo.oothinking;

/**
 * 面向对象思想-具体的实现
 *
 * @author guodd
 * @version 1.0
 * @date 日期:2018/9/23 时间:13:06
 * @since 1.8
 */
public class Bus extends Traffic {
    @Override
    public void go(Address address) {
        System.out.println("乘公交");
    }
}