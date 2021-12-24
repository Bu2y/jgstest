package com.test.dao;

import com.test.entity.lei;

import java.util.List;

public interface ff {
    public int add(lei lei);
    public List<lei> getall();
    public int gettitle(String title);
    public List<lei> getid(int type);
}
