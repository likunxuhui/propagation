package com.haoliwan.propagation.web;

import com.haoliwan.propagation.biz.UserService;
import com.haoliwan.propagation.domain.entity.User;
import com.haoliwan.propagation.result.Result;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("user")
public class UserController {

    @Resource
    UserService userService;


    @RequestMapping("/add")
    public Object add(){
        User user = new User();
        user.setName("likun");
        user.setRemark("test");
        return Result.success(userService.addUser(user));
    }
}
