package dao;

import entity.Working;

import java.util.List;

public interface WorkingDao {
    public int add(Working working);
    public List<Working> getall();
    public int gettitle(String title);
    public List<Working> getid(int type);
}
