package ch14_threadpool.base;

import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * project -
 *
 * @author guod
 * @version 1.0
 * @date 日期:2018/10/31 时间:13:06
 * @JDK 1.8
 * @Description 功能模块：
 */
public class MainTest {
    public static void main(String[] args) {
        //核心线程数；最大线程数；线程空闲时间存活时间；存活时间的单位；任务队列；线程产生的工厂
        ThreadPoolExecutor executor = new ThreadPoolExecutor(3,
                5,
                5,
                TimeUnit.SECONDS,
                new LinkedBlockingQueue<>(),
                Executors.defaultThreadFactory());
    }
}