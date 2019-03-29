package ch06_ios.io_bio;

import java.io.*;

/**
 * project -
 *
 * @author guod
 * @version 1.0
 * @date 日期:2018/6/4 时间:13:47
 * @JDK 1.8
 * @Description 功能模块：
 */
public class MainFileWriterTest {
    public static void main(String[] args) {
        int c;
        Reader reader;
        Writer writer;
        try {
            reader = new FileReader(new File(System.getProperty("user.dir") + "/base-01/src/main/java/ch06/bio/test01.txt"));
            writer = new FileWriter(new File(System.getProperty("user.dir") + "/base-01/src/main/java/ch06/bio/test02.txt"));
            while ((c = reader.read()) != -1) {
                writer.write(c);
            }
            reader.close();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}