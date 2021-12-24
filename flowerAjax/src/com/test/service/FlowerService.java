package com.test.service;

import com.test.entity.Flower;
import com.test.util.PageBean;

import java.util.List;

public interface FlowerService {
    public List<Flower> getAll(PageBean pageBean, String name);
    public int getCount(String name);
    public int add(Flower flower);
    public int update(Flower flower);
    public int delete(Long id);
}
