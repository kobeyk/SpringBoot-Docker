package com.appleyk.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>Hello-World 控制层</p>
 *
 * @author appleyk
 * @version V.1.0.1
 * @date created on 下午 1:43 2019-2-15
 */

@RestController
@RequestMapping("/docker")
public class HelloController {

    @GetMapping("/hello")
    public String sayHello(){
        return "Hello,SpringBoot Test of Docker !";
    }

}
