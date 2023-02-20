package com.moyu.hermes.web.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: zenghai.li
 * @Date: 2023/02/20/21:18
 * @Description:
 */
@Slf4j
@RestController
public class TestController {

    @RequestMapping("test")
    public String test(){
        log.info("发件客户发会计法");

        return "Hermes消息推送平台";
    }
}
