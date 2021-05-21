package com.zhuanye.wiki.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController//返回字符串
//@Controller//返回页面
public class TestController {
   /* restful http请求方式有四种
    GET查询
    POST新增
    PUT修改
    DELETE删除
    /user/1 访问id=1的user即传统方式 /user?id=1
    */
   // @PostMapping
   // @PutMapping
   // @DeleteMapping
   // @RequestMapping(value = "/user/1", method = RequestMethod.GET)
   // @RequestMapping(value = "/user/1", method = RequestMethod.DELETE)

    //@RequestMapping("/hello")//http://127.0.0.1:18080/hello
    @GetMapping("/hello")
    public String hello(){
        return "Hello Word!";
    }
}
