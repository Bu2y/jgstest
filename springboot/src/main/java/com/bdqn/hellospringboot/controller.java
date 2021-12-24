package com.bdqn.hellospringboot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class controller {
    @RequestMapping("/sayhello")
    @ResponseBody
    public String sayhello(){
        return "hello springboot";
    }
}
