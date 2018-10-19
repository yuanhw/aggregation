package com.wyh.mvnt.constant;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author: WangYuanHang
 * @Description:
 * @date: 2018/10/16 15:20
 */
@Component
public class ConfigConstant {
    @Value("${connection.timeout.seconds}")
    public static String connectionTimeout;

    @Value("${read.timeout.seconds}")
    public static String readTimeout;

    @Value("${write.timeout.seconds}")
    public static String writeTimeout;
}
