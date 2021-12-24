package com.test.mapper;

import com.test.entity.T_Address;
import com.test.entity.T_Sys_User;
import com.test.util.MybatisUtil;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.jdbc.SQL;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;


import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;

public class TestMapperTest {
    @Test
    public void count() throws Exception {
        SqlSession sqlSession = MybatisUtil.createSqlSession();
        int count = sqlSession.getMapper(TestMapper.class).count();
        System.out.println("数量是:"+count);
        MybatisUtil.closeSqlSession(sqlSession);

    }
    @Test
    public void getall() throws Exception {
        SqlSession sqlSession = MybatisUtil.createSqlSession();
        List<T_Sys_User> userList = sqlSession.getMapper(TestMapper.class).getall();
        for (int i =0;i<userList.size();i++){
            System.out.println(userList.get(i).getRealName());
        }
        sqlSession.clearCache();
        SqlSession sqlSessions = MybatisUtil.createSqlSession();
        List<T_Sys_User> userLists = sqlSessions.getMapper(TestMapper.class).getall();
        for (int i =0;i<userLists.size();i++){
            System.out.println(userLists.get(i).getRealName());
        }
    }
    @Test
    public void byid() throws Exception{
        SqlSession sqlSession = MybatisUtil.createSqlSession();
        List<T_Sys_User> userList = sqlSession.getMapper(TestMapper.class).byid("刘",2);
        for (int i =0;i<userList.size();i++){
            System.out.println(userList.get(i).getRealName());
        }

    }

    @Test
    public void all() throws Exception {
        SqlSession sqlSession = MybatisUtil.createSqlSession();
        int count = sqlSession.getMapper(TestMapper.class).all();
        System.out.println("数量是:"+count);
        MybatisUtil.closeSqlSession(sqlSession);

    }
    @Test
    public void ljcx() throws Exception {
        SqlSession sqlSession = MybatisUtil.createSqlSession();
        List<T_Sys_User> userList = sqlSession.getMapper(TestMapper.class).ljcx("刘",2);
        for (int i =0;i<userList.size();i++){
            System.out.println(userList.get(i).getRealName()+""+userList.get(i).getRole().getRolename());
        }
        MybatisUtil.closeSqlSession(sqlSession);

    }
    @Test
    public void dzcx() throws Exception {
        SqlSession sqlSession = MybatisUtil.createSqlSession();
        List<T_Sys_User> userList = sqlSession.getMapper(TestMapper.class).dzcx("李",1);

            for (T_Sys_User user:userList) {
                System.out.println(user.getRealName());
                for (T_Address address:user.getAddresses()) {
                    System.out.println(address.getContact()+""+address.getAddressdesc());
                }
        }
        MybatisUtil.closeSqlSession(sqlSession);

    }
    @Test
    public void add() throws  Exception{
        SqlSession sqlSession = MybatisUtil.createSqlSession();
        T_Sys_User t_sys_user = new T_Sys_User();
        t_sys_user.setAccount("123");
        t_sys_user.setRealName("123");
        t_sys_user.setPassword("123");
        t_sys_user.setSex(1);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date rq = null;
        rq = simpleDateFormat.parse("2020-01-01");
        t_sys_user.setBirthday(rq);
        t_sys_user.setPhone("123456789");
        t_sys_user.setAddress("C");
        t_sys_user.setRoleid(1);
        t_sys_user.setCreateduserid(1);
        int count = sqlSession.getMapper(TestMapper.class).add(t_sys_user);

        if(count>0){
            sqlSession.commit();
        }else {
            sqlSession.rollback();
        }
        MybatisUtil.closeSqlSession(sqlSession);
    }
    @Test
    public void del() throws Exception{
        SqlSession sqlSession = MybatisUtil.createSqlSession();
        int count = sqlSession.getMapper(TestMapper.class).del(20L);
        if(count>0){
            sqlSession.commit();
        }else {
            sqlSession.rollback();
        }
        MybatisUtil.closeSqlSession(sqlSession);
    }
    @Test
    public void cx() throws Exception{
        SqlSession sqlSession = MybatisUtil.createSqlSession();
        List<T_Sys_User> userList = sqlSession.getMapper(TestMapper.class).cx("李",null);
        for (int i =0;i<userList.size();i++){
            System.out.println(userList.get(i).getRealName());
        }
        MybatisUtil.closeSqlSession(sqlSession);
    }
    @Test
    public void getbyroleid() throws Exception{
        SqlSession sqlSession = MybatisUtil.createSqlSession();
        List<Integer> tj = new ArrayList<Integer>();
        tj.add(1);
        tj.add(2);
        List<T_Sys_User> userList = sqlSession.getMapper(TestMapper.class).getbyroleid(tj);
        for (int i =0;i<userList.size();i++){
            System.out.println(userList.get(i).getRealName());
        }
        MybatisUtil.closeSqlSession(sqlSession);
    }
    @Test
    public void getbyroleidArray() throws Exception{
        SqlSession sqlSession = MybatisUtil.createSqlSession();
        Integer[] a={1,2};
        List<T_Sys_User> userList = sqlSession.getMapper(TestMapper.class).getbyroleidArray(a);
        for (int i =0;i<userList.size();i++){
            System.out.println(userList.get(i).getRealName());
        }
        MybatisUtil.closeSqlSession(sqlSession);
    }
}