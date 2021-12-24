package com.example.gymstyem.Service.impl;

import com.example.gymstyem.Service.Card_typeService;
import com.example.gymstyem.entity.Card_type;
import com.example.gymstyem.mapper.Card_typeMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class Card_typeServiceImpl implements Card_typeService {
    @Resource
    private Card_typeMapper mapper;
    @Override
    public List<Card_type> getall() {
        return mapper.getall();
    }
}
