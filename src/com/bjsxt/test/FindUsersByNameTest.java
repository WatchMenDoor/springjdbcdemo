package com.bjsxt.test;

import com.bjsxt.pojo.Users;
import com.bjsxt.service.UsersService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class FindUsersByNameTest {
        public static void main(String[] args) {
            ApplicationContext applicationContext =new ClassPathXmlApplicationContext("applicationContext.xml");
            UsersService usersService = (UsersService)applicationContext.getBean("usersService");
            List<Users> list = usersService.findUsersByName("suibian");
            list.forEach(System.out::println);
        }
}