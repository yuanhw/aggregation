package com.wyh.mvnt.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: WangYuanHang
 * @Description:
 * @date: 2018/10/8 15:11
 */
@RestController
@RequestMapping("/two")
@Slf4j
public class TwoController {
    @RequestMapping("twoT")
    public String twoT() {
        log.info("测试towT...");
        return "sss";
    }
}
