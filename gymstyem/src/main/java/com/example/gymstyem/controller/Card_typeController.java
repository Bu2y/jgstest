package com.example.gymstyem.controller;

import com.alibaba.fastjson.JSON;
import com.example.gymstyem.Service.Card_typeService;
import com.example.gymstyem.Service.impl.Card_typeServiceImpl;
import com.example.gymstyem.entity.Card_type;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("/type")
public class Card_typeController {
    @Resource
    private Card_typeService service;
    @RequestMapping("/all")
    @ResponseBody
    public String all(){
        List<Card_type> cardtypelist = service.getall();
        return JSON.toJSONString(cardtypelist);
    }
}
