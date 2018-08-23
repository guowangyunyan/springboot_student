package com.student.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
* @ClassName:  HelloController
* @Description:    java类作用描述
* @Author:         HP
* @CreateDate:     2018/8/22 9:47
* @UpdateUser:      HP
* @UpdateDate:     2018/8/22 9:47
* @UpdateRemark:   修改内容
* @Version:        1.0

*/
@RestController
public class HelloController {

    @GetMapping("/hello")
    public String sayHello(){
        return "Hello SpringBoot !";
    }
}
