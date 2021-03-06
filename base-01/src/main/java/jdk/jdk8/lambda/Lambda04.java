package jdk.jdk8.lambda;

import org.junit.Test;

/**
 * 数据类型可以省略，可以由编译器推动得出。
 *
 * @author guod
 * @version 1.0
 * @since 1.8
 */
public class Lambda04 {
    interface Movable04 {
        int move(int a, int b);
    }

    private static int fun04(Movable04 movable04, int a, int b) {
        return movable04.move(a, b);
    }

    @Test
    public void main() {
        int i = Lambda04.fun04((a, b) -> {
            b++;
            return a + b;
        }, 1, 3);
        System.out.println(i);
    }
}


