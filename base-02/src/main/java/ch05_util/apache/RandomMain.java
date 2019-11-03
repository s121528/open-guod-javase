package ch05_util.apache;

import cn.hutool.core.util.IdUtil;
import jodd.util.RandomStringUtil;
import org.apache.commons.lang3.RandomStringUtils;

/**
 * project -
 *
 * @author guodd
 * @version 1.0
 * @date 日期:2019/4/29 时间:10:57
 * @JDK 1.8
 * @Description 功能模块：
 */
public class RandomMain {
    public static void main(String[] args) {
        System.out.println(RandomStringUtils.randomNumeric(24));
        System.out.println(RandomStringUtil.randomNumeric(1));
        System.out.println(IdUtil.fastSimpleUUID());
    }
}
