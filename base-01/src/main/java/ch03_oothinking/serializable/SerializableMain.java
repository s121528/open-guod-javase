package ch03_oothinking.serializable;

/**
 * project -
 *
 * @author guodd
 * @version 1.0
 * @date 日期:2019/4/29 时间:8:36
 * @JDK 1.8
 * @Description 功能模块：
 * 序列化对象必须实现序列化接口。
 * 序列化对象里面的属性是对象的话也要实现序列化接口。
 * 类的对象序列化后，类的序列化ID不能轻易修改，不然反序列化会失败。
 * 类的对象序列化后，类的属性有增加或者删除不会影响序列化，只是值会丢失。
 * 如果父类序列化了，子类会继承父类的序列化，子类无需添加序列化接口。
 * 如果父类没有序列化，子类序列化了，子类中的属性能正常序列化，但父类的属性会丢失，不能序列化。
 * 用Java序列化的二进制字节数据只能由Java反序列化，不能被其他语言反序列化。如果要进行前后端或者不同语言之间的交互一般需要将对象转变成Json/Xml通用格式的数据，再恢复原来的对象。
 * 如果某个字段不想序列化，在该字段前加上transient关键字即可。
 */
public class SerializableMain {
    public static void main(String[] args) {

    }
}
