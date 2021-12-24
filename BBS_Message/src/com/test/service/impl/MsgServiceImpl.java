package com.test.service.impl;

import com.test.dao.MsgDao;
import com.test.dao.impl.MsgDaoImpl;
import com.test.entity.Msg;
import com.test.service.MsgService;
import com.test.util.PageBean;

import java.util.List;

public class MsgServiceImpl implements MsgService {
    MsgDao msgDao = new MsgDaoImpl();
    @Override
    public List<Msg> selectAll(PageBean pageBean, String name/*String username*/) {
        return msgDao.selectAll(pageBean,name);
    }

    @Override
    public int getCount(String name/*String username*/) {
        return msgDao.getCount(name);
    }

    @Override
    public Msg getIdName(int id) {
        return msgDao.getIdName(id);
    }

    @Override
    public int getdelId(int id) {
        return msgDao.getdelId(id);
    }

    @Override
    public int getUpdate(int id) {
        return msgDao.getUpdate(id);
    }

    @Override
    public int getInsert(Msg msg) {
        return msgDao.getInsert(msg);
    }


}
