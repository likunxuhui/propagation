package com.haoliwan.propagation.biz.impl;

import com.haoliwan.propagation.biz.OrderService;
import com.haoliwan.propagation.biz.UserService;
import com.haoliwan.propagation.domain.entity.User;
import com.haoliwan.propagation.domain.mapper.UserMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


@Service
public class UserServiceImpl implements UserService {

    @Resource
    UserMapper userMapper;

    @Resource
    OrderService orderService;

    /**
     * 不加事务，结果是，程序调用失败，但是数据库里面有数据，没有回滚
     * @param user
     * @return
     */
    @Override
    public User addUser1(User user) {
        int flag = userMapper.insert(user);
        String thread = Thread.currentThread().getName();
        int a = 1/0;
        return userMapper.selectByPrimaryKey(user.getId());
    }

    /**
     * 加事务，用户添加失败，数据库里面没有数据
     * @param user
     * @return
     */
    @Override
    @Transactional
    public User addUser2(User user) {
        int flag = userMapper.insert(user);
        String thread = Thread.currentThread().getName();
        int a = 1/0;
        return userMapper.selectByPrimaryKey(user.getId());
    }

    //没有事务，没有异常，没有catch异常
    @Override
    public User addUser3(User user,Integer type) {
        int flag = userMapper.insert(user);
        String thread = Thread.currentThread().getName();
        switch (type){
            case 1:
                orderService.addOrder1();break;
            case 2:
                orderService.addOrder2();break;
            case 3:
                orderService.addOrder3();break;
            case 4:
                orderService.addOrder4();break;
            case 5:
                orderService.addOrder5();break;
            case 6:
                orderService.addOrder6();break;
            case 7:
                orderService.addOrder7();break;
            case 8:
                orderService.addOrder8();break;
            case 9:
                orderService.addOrder9();break;
            case 10:
                orderService.addOrder10();break;
            case 11:
                orderService.addOrder11();break;
            case 12:
                orderService.addOrder12();break;
            case 13:
                orderService.addOrder13();break;
            case 14:
                orderService.addOrder14();break;
            case 15:
                orderService.addOrder15();break;
            case 16:
                orderService.addOrder16();break;
        }
        return userMapper.selectByPrimaryKey(user.getId());
    }

    @Override
    public User addUser4(User user,Integer type) {
        int flag = userMapper.insert(user);
        String thread = Thread.currentThread().getName();
        try{
            switch (type){
                case 1:
                    orderService.addOrder1();break;
                case 2:
                    orderService.addOrder2();break;
                case 3:
                    orderService.addOrder3();break;
                case 4:
                    orderService.addOrder4();break;
                case 5:
                    orderService.addOrder5();break;
                case 6:
                    orderService.addOrder6();break;
                case 7:
                    orderService.addOrder7();break;
                case 8:
                    orderService.addOrder8();break;
                case 9:
                    orderService.addOrder9();break;
                case 10:
                    orderService.addOrder10();break;
                case 11:
                    orderService.addOrder11();break;
                case 12:
                    orderService.addOrder12();break;
                case 13:
                    orderService.addOrder13();break;
                case 14:
                    orderService.addOrder14();break;
                case 15:
                    orderService.addOrder15();break;
                case 16:
                    orderService.addOrder16();break;
            }
        }catch (Exception e){
            System.out.println(e);
        }
        return userMapper.selectByPrimaryKey(user.getId());
    }

    @Override
    public User addUser5(User user,Integer type) {
        int flag = userMapper.insert(user);
        String thread = Thread.currentThread().getName();
        switch (type){
            case 1:
                orderService.addOrder1();break;
            case 2:
                orderService.addOrder2();break;
            case 3:
                orderService.addOrder3();break;
            case 4:
                orderService.addOrder4();break;
            case 5:
                orderService.addOrder5();break;
            case 6:
                orderService.addOrder6();break;
            case 7:
                orderService.addOrder7();break;
            case 8:
                orderService.addOrder8();break;
            case 9:
                orderService.addOrder9();break;
            case 10:
                orderService.addOrder10();break;
            case 11:
                orderService.addOrder11();break;
            case 12:
                orderService.addOrder12();break;
            case 13:
                orderService.addOrder13();break;
            case 14:
                orderService.addOrder14();break;
            case 15:
                orderService.addOrder15();break;
            case 16:
                orderService.addOrder16();break;
        }
        int a = 1/0;
        return userMapper.selectByPrimaryKey(user.getId());
    }

    @Override
    public User addUser6(User user,Integer type) {
        int flag = userMapper.insert(user);
        String thread = Thread.currentThread().getName();
        try{
            switch (type){
                case 1:
                    orderService.addOrder1();break;
                case 2:
                    orderService.addOrder2();break;
                case 3:
                    orderService.addOrder3();break;
                case 4:
                    orderService.addOrder4();break;
                case 5:
                    orderService.addOrder5();break;
                case 6:
                    orderService.addOrder6();break;
                case 7:
                    orderService.addOrder7();break;
                case 8:
                    orderService.addOrder8();break;
                case 9:
                    orderService.addOrder9();break;
                case 10:
                    orderService.addOrder10();break;
                case 11:
                    orderService.addOrder11();break;
                case 12:
                    orderService.addOrder12();break;
                case 13:
                    orderService.addOrder13();break;
                case 14:
                    orderService.addOrder14();break;
                case 15:
                    orderService.addOrder15();break;
                case 16:
                    orderService.addOrder16();break;
            }
        }catch (Exception e){
            System.out.println(e);
        }
        int a = 1/0;
        return userMapper.selectByPrimaryKey(user.getId());
    }


    @Override
    @Transactional
    public User addUser7(User user,Integer type) {
        int flag = userMapper.insert(user);
        String thread = Thread.currentThread().getName();

        switch (type){
            case 1:
                orderService.addOrder1();break;
            case 2:
                orderService.addOrder2();break;
            case 3:
                orderService.addOrder3();break;
            case 4:
                orderService.addOrder4();break;
            case 5:
                orderService.addOrder5();break;
            case 6:
                orderService.addOrder6();break;
            case 7:
                orderService.addOrder7();break;
            case 8:
                orderService.addOrder8();break;
            case 9:
                orderService.addOrder9();break;
            case 10:
                orderService.addOrder10();break;
            case 11:
                orderService.addOrder11();break;
            case 12:
                orderService.addOrder12();break;
            case 13:
                orderService.addOrder13();break;
            case 14:
                orderService.addOrder14();break;
            case 15:
                orderService.addOrder15();break;
            case 16:
                orderService.addOrder16();break;
        }
        return userMapper.selectByPrimaryKey(user.getId());
    }

    @Override
    @Transactional
    public User addUser8(User user ,Integer type) {
        int flag = userMapper.insert(user);
        String thread = Thread.currentThread().getName();
        try{
            switch (type){
                case 1:
                    orderService.addOrder1();break;
                case 2:
                    orderService.addOrder2();break;
                case 3:
                    orderService.addOrder3();break;
                case 4:
                    orderService.addOrder4();break;
                case 5:
                    orderService.addOrder5();break;
                case 6:
                    orderService.addOrder6();break;
                case 7:
                    orderService.addOrder7();break;
                case 8:
                    orderService.addOrder8();break;
                case 9:
                    orderService.addOrder9();break;
                case 10:
                    orderService.addOrder10();break;
                case 11:
                    orderService.addOrder11();break;
                case 12:
                    orderService.addOrder12();break;
                case 13:
                    orderService.addOrder13();break;
                case 14:
                    orderService.addOrder14();break;
                case 15:
                    orderService.addOrder15();break;
                case 16:
                    orderService.addOrder16();break;
            }
        }catch (Exception e){
            System.out.println(e);
        }
        return userMapper.selectByPrimaryKey(user.getId());
    }

    @Override
    @Transactional
    public User addUser9(User user,Integer type) {
        int flag = userMapper.insert(user);
        String thread = Thread.currentThread().getName();

        switch (type){
            case 1:
                orderService.addOrder1();break;
            case 2:
                orderService.addOrder2();break;
            case 3:
                orderService.addOrder3();break;
            case 4:
                orderService.addOrder4();break;
            case 5:
                orderService.addOrder5();break;
            case 6:
                orderService.addOrder6();break;
            case 7:
                orderService.addOrder7();break;
            case 8:
                orderService.addOrder8();break;
            case 9:
                orderService.addOrder9();break;
            case 10:
                orderService.addOrder10();break;
            case 11:
                orderService.addOrder11();break;
            case 12:
                orderService.addOrder12();break;
            case 13:
                orderService.addOrder13();break;
            case 14:
                orderService.addOrder14();break;
            case 15:
                orderService.addOrder15();break;
            case 16:
                orderService.addOrder16();break;
        }
        Integer error = 1/0;
        return userMapper.selectByPrimaryKey(user.getId());
    }

    @Override
    @Transactional
    public User addUser10(User user ,Integer type) {
        int flag = userMapper.insert(user);
        String thread = Thread.currentThread().getName();
        try{
            switch (type){
                case 1:
                    orderService.addOrder1();break;
                case 2:
                    orderService.addOrder2();break;
                case 3:
                    orderService.addOrder3();break;
                case 4:
                    orderService.addOrder4();break;
                case 5:
                    orderService.addOrder5();break;
                case 6:
                    orderService.addOrder6();break;
                case 7:
                    orderService.addOrder7();break;
                case 8:
                    orderService.addOrder8();break;
                case 9:
                    orderService.addOrder9();break;
                case 10:
                    orderService.addOrder10();break;
                case 11:
                    orderService.addOrder11();break;
                case 12:
                    orderService.addOrder12();break;
                case 13:
                    orderService.addOrder13();break;
                case 14:
                    orderService.addOrder14();break;
                case 15:
                    orderService.addOrder15();break;
                case 16:
                    orderService.addOrder16();break;
            }
        }catch (Exception e){
            System.out.println(e);
        }
        Integer error = 1/0;
        return userMapper.selectByPrimaryKey(user.getId());
    }

}
