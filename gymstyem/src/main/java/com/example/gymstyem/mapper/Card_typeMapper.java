package com.example.gymstyem.mapper;

import com.example.gymstyem.entity.Card_type;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface Card_typeMapper {
    public List<Card_type> getall();
}
