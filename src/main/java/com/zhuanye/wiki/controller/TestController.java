package com.zhuanye.wiki.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController//返回字符串
//@Controller//返回页面
public class TestController {
    @Value("${test.hello:TEST}")
    private String testHello;

   /* restful http请求方式有四种
    GET查询
    POST新增
    PUT修改
    DELETE删除
    /user/1 访问id=1的user即传统方式 /user?id=1
    */
   // @PostMapping 浏览器访问不到，因为浏览器不接受POST请求
   // @PutMapping
   // @DeleteMapping
   // @RequestMapping(value = "/user/1", method = RequestMethod.GET)
   // @RequestMapping(value = "/user/1", method = RequestMethod.DELETE)

    //@RequestMapping("/hello")//http://127.0.0.1:18080/hello
    @GetMapping("/hello")
    public String hello(){
        return "Hello World!" + testHello;
    }

    @PostMapping("/hello/post")
    public String helloPost(String name){
        return "Hello World! post,"+ name;
    }

}
