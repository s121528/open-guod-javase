package ch17_java8.optional;

import org.springframework.util.Assert;

import java.util.Optional;

/**
 * project -
 *
 * @author guodd
 * @version 1.0
 * @date 日期:2018/11/7 时间:21:06
 * @JDK 1.8
 * @Description 功能模块：
 */
public class OptionalTestMain04 {
    public static void main(String[] args) {
        User user = new User();
        User user1 = new User("guod", 12);
        Optional.of(user).ifPresent(u -> {
            System.out.println(u.getName());
        });

        Assert.notNull(user1, "");
        Optional.ofNullable(user1).ifPresent(u -> {
            System.out.println(u.getName());
        });
    }
}