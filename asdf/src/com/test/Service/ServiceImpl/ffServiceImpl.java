package com.test.Service.ServiceImpl;

import com.test.Service.ffService;
import com.test.dao.Impl.ffImpl;
import com.test.entity.lei;
import com.test.dao.ff;
import java.util.List;

public class ffServiceImpl implements ffService {
    ff ff = new ffImpl();
    @Override
    public int add(lei lei) {
        return ff.add(lei);
    }

    @Override
    public List<lei> getall() {
        return ff.getall();
    }
    @Override
    public int gettitle(String title){return ff.gettitle(title);}
    @Override
    public List<lei> getid(int type){return ff.getid(type);}
}
