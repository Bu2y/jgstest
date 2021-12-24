package com.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/user")
public class usercontroller {
    @RequestMapping(value = "/aa",method = RequestMethod.POST)
    public String aa(){
        System.out.println("Aa");
        return "aa";
    }
//    @RequestMapping("/all")
//    public ModelAndView all(){
//        ModelAndView modelAndView = new ModelAndView();
//        modelAndView.addObject("username","admin");
//        modelAndView.setViewName("success");
//        return modelAndView;
//    }
    @RequestMapping("/all")
    public String all2(Model model) {
        model.addAttribute("username","admin");
        return "success";
    }
}
