package com.haoliwan;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@EnableTransactionManagement
@SpringBootApplication
@ComponentScan(basePackages = {"com.haoliwan","com.haoliwan.propagation.web"})
@MapperScan("com.haoliwan.propagation.domain.mapper")
@EntityScan("com.haoliwan.propagation.domain.entity")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @RequestMapping("/say")
    @ResponseBody
    public Object sayHello(@RequestParam("name") String hname){
        return "hello," + hname;
        //@ComponentScan(basePackages = {"com.haoliwan"})
    }


}
