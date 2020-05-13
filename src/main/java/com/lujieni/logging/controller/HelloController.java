package com.lujieni.logging.controller;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther lujieni
 * @Date 2020/5/11
 */
@RestController
@Slf4j
public class HelloController {

   /*
      不使用@Slf4j手工引入也可以,但都是org.slf4j包下的
      private static final Logger logger = LoggerFactory.getLogger(HelloController.class);
    */
    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String hello(){
        log.info("hello");
        return "hello";
    }


}
