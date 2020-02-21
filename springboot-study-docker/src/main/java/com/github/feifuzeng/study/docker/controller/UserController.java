package com.github.feifuzeng.study.docker.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

/**
 * @author feifz
 * @version 1.0.0
 * @Description 用户控制器
 * @createTime 2020年02月19日 17:02:00
 */
@RestController
@RequestMapping("/user")
@Log4j2
public class UserController {


    @RequestMapping("/test")
    public String test(){
        log.info("请求啦啦啦啦。。。时间：{}", LocalDateTime.now());
        return "hello ,springboot in docker .";
    }

}
