package datastructure.ch02_stacks.ch02_array_stack;

/**
 * project -
 *
 * @author guodd
 * @version 1.0
 * @date 日期:2019/1/24 时间:16:23
 * @JDK 1.8
 * @Description 功能模块：
 */
public interface Stack<E> {
    // 添加元素（入栈）
    void push(E e);

    // 删除元素（出栈）
    E pop();

    // 获取栈顶元素（top）
    E peek();

    // 栈是否为空
    boolean isEmpty();

    // 获取栈中元素个数
    int getSize();
}