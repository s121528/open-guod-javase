package datastructure.ch03_queues.ch02_array_queue;

/**
 * project -
 *
 * @author guodd
 * @version 1.0
 * @date 日期:2019/1/25 时间:9:49
 * @JDK 1.8
 * @Description 功能模块：
 */
public class ArrayQueue<E> implements Queue<E> {
    private Array<E> array;

    public ArrayQueue() {
        this(10);
    }

    public ArrayQueue(int capacity) {
        array = new Array<>(capacity);
    }

    @Override
    public int getSize() {
        return array.getSize();
    }

    @Override
    public boolean isEmpty() {
        return array.isEmpty();
    }

    @Override
    public void enqueue(E e) {
        array.addLast(e);
    }

    @Override
    public E dequeue() {
        return array.removeFirst();
    }

    @Override
    public E getFront() {
        return array.getFirst();
    }
    @Override
    public String toString(){

        StringBuilder res = new StringBuilder();
        res.append("Queue: ");
        res.append("front [");
        for(int i = 0 ; i < array.getSize() ; i ++){
            res.append(array.get(i));
            if(i != array.getSize() - 1)
                res.append(", ");
        }
        res.append("] tail");
        return res.toString();
    }
}
