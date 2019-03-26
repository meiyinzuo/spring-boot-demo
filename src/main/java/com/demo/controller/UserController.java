package com.demo.controller;

import com.demo.pojo.IMoocJSONResult;
import com.demo.pojo.User;
import java.util.Date;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author meiyinzuo@163.com
 * @version 创建时间：2019年3月26日 上午11:17:20
 * @ClassName 类名称
 * @Description 类描述
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/getUser")
    public User getUser() {
        User user = new User();
        user.setAge(111);
        user.setBirthday(new Date());
        // user.setDesc("user");
        user.setName("aaa");
        user.setPassword("123");
        return user;
    }

    @RequestMapping("/getJsonUser")
    public IMoocJSONResult getJsonUser() {
        User user = new User();
        user.setAge(111);
        user.setBirthday(new Date());
        // user.setDesc("user");
        user.setName("aaa2");
        user.setPassword("123");
        return IMoocJSONResult.ok(user);
    }
}
