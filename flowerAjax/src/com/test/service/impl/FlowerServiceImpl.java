package com.test.service.impl;


import com.test.dao.FlowerDao;
import com.test.dao.impl.FlowerDaoImpl;
import com.test.entity.Flower;
import com.test.service.FlowerService;
import com.test.util.PageBean;

import java.util.List;

public class FlowerServiceImpl implements FlowerService {
    FlowerDao flowerDao=new FlowerDaoImpl();
    @Override
    public List<Flower> getAll(PageBean pageBean, String name) {
        return flowerDao.getAll(pageBean,name);
    }

    @Override
    public int getCount(String name) {
        return flowerDao.getCount(name);
    }

    @Override
    public int add(Flower flower) {
        return flowerDao.add(flower);
    }

    @Override
    public int update(Flower flower) {
        return flowerDao.update(flower);
    }

    @Override
    public int delete(Long id) {
        return flowerDao.delete(id);
    }
}
