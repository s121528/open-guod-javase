package ch03_oothinking.classuse;

import lombok.Data;

/**
 * The class/interface 面向对象思想
 * 面向过程：
 * 优点：性能比面向对象高，因为类调用时需要实例化，开销比较大，比较消耗资源; 比如单片机、嵌入式开发、Linux/Unix 等一般采用面向过程开发，性能是最重要的因素。
 * 缺点：没有面向对象易维护、易复用、易扩展
 * <p>
 * 面向对象：
 * 优点：易维护、易复用、易扩展，由于面向对象有封装、继承、多态性的特性，可以设计出低耦合的系统，使系统更加灵活、更加易于维护
 * 缺点：性能比面向过程低
 * <p>
 * 面向过程是具体化的，流程化的，解决一个问题，你需要一步一步的分析，一步一步的实现。
 * 面向对象是模型化的，你只需抽象出一个类，这是一个封闭的盒子，在这里你拥有数据也拥有解决问题的方法。
 * 需要什么功能直接使用就可以了，不必去一步一步的实现，至于这个功能是如何实现的，管我们什么事？我们会用就可以了。
 * 面向对象的底层其实还是面向过程，把面向过程抽象成类，然后封装，方便我们使用的就是面向对象了。
 *
 * @author guodd
 * @version 1.0 use jdk 1.8
 * 在调用子类构造方法之前会先调用父类没有参数的构造方法，其目的是？帮助子类做初始化工作。
 * 一个类的构造方法的作用是什么？若一个类没有声明构造方法，改程序能正确执行吗？为什么？
 * 主要作用是完成对类对象的初始化工作。可以执行。因为一个类即使没有声明构造方法也会有默认的不带参数的构造方法。
 */
@Data
public class ClassUse {
    // 作用域、存储位置、生命周期、初始值四个方面分析考虑属性
    /**
     * 属性描述：name
     */
    private String name;

    public String init() {
        String age = "";
        return age;
    }

    public static void main(String[] args) {
        ClassUse classUse = new ClassUse();
        System.out.println(classUse.name);
        classUse.init();
    }
}
