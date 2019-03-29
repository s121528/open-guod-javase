package ch12_annotations.base;

/**
 * project -
 *
 * @author guod
 * @version 1.0
 * @date 日期:2018/9/12 时间:9:25
 * @JDK 1.8
 * @Description 功能模块：
 */
public class AnnotationDemo {
    /**
     * 属性描述：属性
     */
    @MyAnnotation(name = "userName")
    private String name;

    /**
     * 功能描述：属性
     */
    @MyAnnotation(name = "userAge")
    private Integer age;


    @MyAnnotation(name = "lvr", website = "hellos", revision = 22)
    public static void main(String[] args) {
        System.out.println("I am main method");
    }

    @MyAnnotation(name = "lvr", website = "hellos", revision = 2)
    public void demo() {
        System.out.println("I am demo method");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}