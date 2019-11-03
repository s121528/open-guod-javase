package jdk.jdk8.base64;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Base64;

/**
 * project -
 *
 * @author guod
 * @version 1.0
 * @date 日期:2018/11/5 时间:15:50
 * @JDK 1.8
 * @Description 功能模块：Java 8提供的Base64，要比sun.mis c套件提供的还要快至少11倍，比Apache Commons Codec提供的还要快至少3倍。
 */
public class Base64Test02 {
    private static Base64.Encoder encoder = Base64.getEncoder();
    private static Base64.Decoder decoder = Base64.getDecoder();

    public static void main(String[] args) throws Exception {
        // 编码
        String text = "Java开发";
        byte[] bytes = text.getBytes(StandardCharsets.UTF_8);
        byte[] encode = encoder.encode(bytes);
        System.out.println(Arrays.toString(encode));
        // 解密
        System.out.println(new String(decoder.decode(encode), StandardCharsets.UTF_8));
    }
}
