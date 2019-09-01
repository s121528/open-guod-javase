package ch00_design_principles.openclose;

/**
 * project - 开闭原则
 *
 * @author guodd
 * @version 1.0
 * @date 日期:2019/8/29 时间:13:00
 * @JDK 1.8
 * @Description 功能模块：
 */
public interface Course {
    Integer getId();

    String getName();

    Double getPrice();
}
