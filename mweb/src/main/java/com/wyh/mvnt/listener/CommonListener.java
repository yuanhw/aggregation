package com.wyh.mvnt.listener;

import lombok.extern.slf4j.Slf4j;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * @author: WangYuanHang
 * @Description:
 * @date: 2018/9/30 13:49
 */
@Slf4j
public class CommonListener implements ServletContextListener {
    public void contextInitialized(ServletContextEvent sce) {
        log.info("应用启动......");
    }

    public void contextDestroyed(ServletContextEvent sce) {
        log.info("应用关闭......");
    }
}
