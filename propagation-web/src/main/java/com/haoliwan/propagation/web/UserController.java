package com.haoliwan.propagation.web;

import com.haoliwan.propagation.biz.UserService;
import com.haoliwan.propagation.domain.entity.User;
import com.haoliwan.propagation.result.Result;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
        return Result.success(userService.addUser1(user));
    }

    @RequestMapping("/propagation")
    public Object propagation(@RequestParam(value = "userMethod") Integer userMethod,
                              @RequestParam(value = "orderMethod") Integer orderMethod){
        User user = new User();
        user.setName("likun");
        user.setRemark("test");

        try{
            switch (userMethod) {
                case 1:
                    userService.addUser1(user);
                    break;
                case 2:
                    userService.addUser2(user);
                    break;
                case 3:
                    userService.addUser3(user,orderMethod);
                    break;
                case 4:
                    userService.addUser4(user,orderMethod);
                    break;
                case 5:
                    userService.addUser5(user,orderMethod);
                    break;
                case 6:
                    userService.addUser6(user,orderMethod);
                    break;
                case 7:
                    userService.addUser7(user,orderMethod);
                    break;
                case 8:
                    userService.addUser8(user,orderMethod);
                    break;
                case 9:
                    userService.addUser9(user,orderMethod);
                    break;
                case 10:
                    userService.addUser10(user,orderMethod);
                    break;
            }
            return Result.success(userService.addUser1(user));
        }catch (Exception e){
            return Result.error("SYS001",e.getMessage());
        }

    }
}
