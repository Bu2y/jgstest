package com.test.Service;

import com.test.entity.lei;

import java.util.List;

public interface ffService {
    public int gettitle(String title);
    public int add(lei lei);
    public List<lei> getall();
    public List<lei> getid(int type);
}
