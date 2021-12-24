package service.Impl;

import dao.Impl.WorkingDaoImpl;
import dao.WorkingDao;
import entity.Working;
import service.WorkingService;

import java.util.List;

public class WorkingServiceImpl implements WorkingService {
    WorkingDao workingDao = new WorkingDaoImpl();

    @Override
    public int add(Working working) {
       return workingDao.add(working);
    }

    @Override
    public List<Working> getall() {
        return workingDao.getall();
    }

    @Override
    public int gettitle(String title) {
        return workingDao.gettitle(title);
    }

    @Override
    public List<Working> getid(int type) {
        return workingDao.getid(type);
    }
}
