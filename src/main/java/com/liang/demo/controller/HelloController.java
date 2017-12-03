package com.liang.demo.controller;

import com.liang.demo.config.TestProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @author liangruijia
 */
@RestController
public class HelloController {
    @Autowired
    TestProperties testProperties;

    @RequestMapping(value = "/hello")
    public String helloWorld(){
        return "hello my wonderful world:" + testProperties.getAppName() + "," + testProperties.getVersion();
    }
}
