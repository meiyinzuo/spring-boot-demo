package com.demo.controller;

import com.demo.pojo.IMoocJSONResult;
import com.demo.pojo.Resource;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author meiyinzuo@163.com
 * @version 创建时间：2019年3月26日 下午4:42:08
 * @ClassName 类名称
 * @Description 类描述
 */
@RestController
@RequestMapping("/")
public class HelloController {

    @Autowired
    private Resource resource;

    @RequestMapping("/hello")
    public String hello() {
        return "hello world";
    }

    @RequestMapping("/getResource")
    public IMoocJSONResult getResource() {

        Resource bean = new Resource();
        BeanUtils.copyProperties(resource, bean);
        return IMoocJSONResult.ok(bean);

    }

}
