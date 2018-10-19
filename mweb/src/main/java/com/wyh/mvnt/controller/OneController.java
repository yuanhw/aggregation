package com.wyh.mvnt.controller;

import com.alibaba.fastjson.JSONObject;
import com.wyh.mvnt.entity.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: WangYuanHang
 * @Description:
 * @date: 2018/9/30 14:51
 */
@RestController
@RequestMapping("/one")
@Slf4j
public class OneController {
    @RequestMapping("testOne")
    public User testOne() {
        log.info("测试日志...");
        User user = new User();
        user.setId(1L);
        user.setName("张三");
        return user;
    }

    @RequestMapping("testTwo")
    public String testTwo() {
        log.info("测试2...");
        JSONObject obj = new JSONObject();
        obj.put("1", "001");
        return obj.toJSONString();
    }
}
