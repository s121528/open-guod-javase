package ch03_oothinking.relation;

/**
 * 组合(Composition)
 * 举例：房子和房间的关系，当房子没有了，房间同样不可能单独存在。
 * 体现：组合也是关联关系的一种特例，他体现的是一种contains-a的关系，这种关系比聚合更强，也称为强聚合。
 * 同样，组合关系中，两个类额关系也是不平等的。contains-a
 * UML：实心菱形 + 实线 + 箭头（Room—>House）
 * 箭头：箭头指向代表个体/部分的对象,也就是被合成/组合的类的对象;
 *
 * @author guodd
 * @version 1.0
 * @since 1.8
 */
public class CompositionClass {
    public static void main(String[] args) {
        Room room = new Room();
        room.createRoom();
    }
}

class Room {
    void createRoom() {
        System.out.println("创建房间");
        new Room();
    }
}

class House {
    Room room;

    public House() {
        room = new Room();
    }

    public void createHouse() {
        room.createRoom();
    }

}
