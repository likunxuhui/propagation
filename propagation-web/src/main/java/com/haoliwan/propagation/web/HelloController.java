package com.haoliwan.propagation.web;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("hello")
public class HelloController {

    @RequestMapping("/say")
    public Object sayHello(@RequestParam("name") String hname){
        return "hello," + hname;
        //@ComponentScan(basePackages = {"com.haoliwan"})
    }
}
