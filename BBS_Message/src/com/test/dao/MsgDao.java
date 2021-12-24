package com.test.dao;

import com.test.entity.Msg;
import com.test.util.PageBean;

import java.util.List;

public interface MsgDao {
    /**
     * 遍历用户信息
     * @param pageBean
     * @param name
     * @return
     */
    public List<Msg> selectAll(PageBean pageBean,String name/*String username*/);

    /**
     * 实现分页功能
     * @param name
     * @return
     */
    public int getCount(String name/*String username*/);

    /**
     * 根据id查看信息
     * @param id
     * @return
     */
    public Msg getIdName(int id);

    /**
     * 根据id删除短息信息
     * @param id
     * @return
     */
    public int getdelId(int id);

    /**
     * 修改短信状态
     * @param id
     * @return
     */
    public int getUpdate(int id);

    /**
     *回复和发送信息
     * @param msg
     * @return
     */
    public int getInsert(Msg msg);
}
