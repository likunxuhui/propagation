package com.haoliwan.propagation.biz.impl;

import com.haoliwan.propagation.biz.OrderService;
import com.haoliwan.propagation.domain.entity.Order;
import com.haoliwan.propagation.domain.mapper.OrderMapper;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
public class OrderServiceImpl implements OrderService {

    @Resource
    OrderMapper orderMapper;

    @Override
    public Order addOrder1() {
        Order order = new Order();
        order.setName("addOrder1");
        order.setRemark("没有事务，不抛异常");
        orderMapper.insert(order);
        return null;
    }

    @Override
    public Order addOrder2() {
        Order order = new Order();
        order.setName("addOrder2");
        order.setRemark("没有事务，抛异常");
        orderMapper.insert(order);
        Integer flag = 1/0;
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public Order addOrder3() {
        Order order = new Order();
        order.setName("addOrder3");
        order.setRemark("有事务REQUIRES_NEW，不抛异常");
        orderMapper.insert(order);
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public Order addOrder4() {
        Order order = new Order();
        order.setName("addOrder4");
        order.setRemark("有事务REQUIRES_NEW，抛异常");
        orderMapper.insert(order);
        Integer flag = 1/0;
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public Order addOrder5() {
        Order order = new Order();
        order.setName("addOrder5");
        order.setRemark("有事务REQUIRED，不抛异常");
        orderMapper.insert(order);
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public Order addOrder6() {
        Order order = new Order();
        order.setName("addOrder6");
        order.setRemark("有事务REQUIRED，抛异常");
        orderMapper.insert(order);
        Integer flag = 1/0;
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public Order addOrder7() {
        Order order = new Order();
        order.setName("addOrder7");
        order.setRemark("有事务SUPPORTS，不抛异常");
        orderMapper.insert(order);
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public Order addOrder8() {
        Order order = new Order();
        order.setName("addOrder8");
        order.setRemark("有事务SUPPORTS，抛异常");
        orderMapper.insert(order);
        Integer flag = 1/0;
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public Order addOrder9() {
        Order order = new Order();
        order.setName("addOrder9");
        order.setRemark("有事务NOT_SUPPORTED，不抛异常");
        orderMapper.insert(order);
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public Order addOrder10() {
        Order order = new Order();
        order.setName("addOrder10");
        order.setRemark("有事务NOT_SUPPORTED，抛异常");
        orderMapper.insert(order);
        Integer flag = 1/0;
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.NEVER)
    public Order addOrder11() {
        Order order = new Order();
        order.setName("addOrder11");
        order.setRemark("有事务NEVER，不抛异常");
        orderMapper.insert(order);
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.NEVER)
    public Order addOrder12() {
        Order order = new Order();
        order.setName("addOrder12");
        order.setRemark("有事务NEVER，抛异常");
        orderMapper.insert(order);
        Integer flag = 1/0;
        return null;
    }

    @Transactional(propagation = Propagation.MANDATORY)
    @Override
    public Order addOrder13() {
        Order order = new Order();
        order.setName("addOrder13");
        order.setRemark("有事务MANDATORY，不抛异常");
        orderMapper.insert(order);
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.MANDATORY)
    public Order addOrder14() {
        Order order = new Order();
        order.setName("addOrder14");
        order.setRemark("有事务MANDATORY，抛异常");
        orderMapper.insert(order);
        Integer flag = 1/0;
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.NESTED)
    public Order addOrder15() {
        Order order = new Order();
        order.setName("addOrder15");
        order.setRemark("有事务NESTED，不抛异常");
        orderMapper.insert(order);
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.NESTED)
    public Order addOrder16() {
        Order order = new Order();
        order.setName("addOrder16");
        order.setRemark("有事务NESTED，抛异常");
        orderMapper.insert(order);
        Integer flag = 1/0;
        return null;
    }
}
