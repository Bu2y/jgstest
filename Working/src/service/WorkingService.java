package service;

import entity.Working;

import java.util.List;

public interface WorkingService {
    public int add(Working working);
    public List<Working> getall();
    public int gettitle(String title);
    public List<Working> getid(int type);
}
