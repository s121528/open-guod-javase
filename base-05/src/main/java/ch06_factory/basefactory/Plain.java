package ch06_factory.basefactory;

/**
 * project -
 *
 * @author yanfa07
 * @version 1.0
 * @date 日期:2019/3/29 时间:15:28
 * @JDK 1.8
 * @Description 功能模块：
 */
public class Plain implements Movable {
    @Override
    public void run() {
        System.out.println("飞机");
    }
}
