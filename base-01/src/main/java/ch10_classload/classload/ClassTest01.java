package ch10_classload.classload;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * project -
 *
 * @author guodd
 * @version 1.0
 * @date 日期:2018/9/16 时间:19:57
 * @JDK 1.8
 * @Description 功能模块：
 */
public class ClassTest01 {
    public static void main(String[] args) {
        try {
            String str = "ch10_classloads.classload.T01";
            // 把名字叫XXX的类加载到内存中
            Class<?> c = Class.forName(str);
            Object o = c.newInstance();
            Method[] methods = c.getMethods();
            for (Method method : methods) {
                if (method.getName().equals("mm")) {
                    // 参数可变
                    for (Class<?> paramType : method.getParameterTypes()) {
                        System.out.println(paramType.getName());
                    }
                    Class<?> returnType = method.getReturnType();
                    System.out.println(returnType.getName());
                    method.invoke(o, 1, 2);
                }
            }

        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}

class T01 {
    private int i;
    private int j;

    public T01() {
    }

    public T01(int i, int j) {
        this.i = i;
        this.j = j;
    }

    static {
        System.out.println(" T class loader ");
    }

    public void mm(int i, int j) {
        int y = i + j;
        System.out.println(" mm " + y);
    }
}