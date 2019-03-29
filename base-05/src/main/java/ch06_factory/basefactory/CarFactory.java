package ch06_factory.basefactory;

/**
 * project - 简单工厂模式
 *
 * @author guodd
 * @version 1.0
 * @date 日期:2018/8/11 时间:15:09
 * @JDK 1.8
 * @Description 功能模块：
 */
public class CarFactory extends VehicleFactory {
    @Override
    public Car create() {
        return new Car();
    }
}
