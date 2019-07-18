package com.iweb.springboot1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @author azzhu
 * @create 2019-07-17 09:23:38
 */
@RestController
//@Controller
//@ResponseBody
public class HelloBoot {

    @GetMapping("/hello")
    public Object hello() {
        List<String> list = new ArrayList<>();
        list.add("zzzz");
        list.add("bbbbb");
        list.add("ccccc");
        return list;
    }
}
