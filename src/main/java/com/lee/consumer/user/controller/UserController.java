package com.lee.consumer.user.controller;

import com.lee.consumer.user.pojo.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController {

    @RequestMapping("/userList")
    public List<User> userList(){
        List<User> listUser = new ArrayList<>();
        listUser.add(new User(1,"jay",30));
        listUser.add(new User(2,"Lin",34));
        listUser.add(new User(4,"Ling",36));
        return listUser;
    }
}
