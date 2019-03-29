package ch07_threads.thread;

/**
 * project -
 *
 * @author guod
 * @version 1.0
 * @date 日期:2018/6/22 时间:13:17
 * @JDK 1.8
 * @Description 功能模块：线程的面试题
 * 一个方法同步了，另一个方法没有同步，别的线程可以自由访问不同步的方法，可能对同步方法造成影响
 */
public class TT04 implements Runnable {
    int b = 100;

    public static void main(String[] args) throws InterruptedException {
        TT04 tt = new TT04();
        // 问题01：可以访问没有锁定的方法
        Thread t = new Thread(tt);
        t.start();
        tt.m02();
        System.out.println(tt.b);
    }

    @Override
    public void run() {
        try {
            m01();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 互斥锁
    public synchronized void m01() throws Exception {
        b = 1000;
        Thread.sleep(5000);
        System.out.println("b的值：" + b);
    }

    public synchronized void m02() throws InterruptedException {
        Thread.sleep(10000);
        b = 2000;
    }

}