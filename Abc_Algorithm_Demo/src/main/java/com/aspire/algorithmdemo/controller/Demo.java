package com.aspire.algorithmdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试
 *
 * @author JustryDeng
 * @date 2019/4/20 12:49
 */
@RestController
public class Demo {


    @GetMapping("/test")
    public String test() {
        return "hello JustryDeng!";
    }
}
