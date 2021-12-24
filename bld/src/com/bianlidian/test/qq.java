package com.bianlidian.test;

import com.bianlidian.mapper.T_Sys_UserMapper;
import com.bianlidian.pojo.T_Address;
import com.bianlidian.pojo.T_Sys_User;
import com.bianlidian.util.MyBatusUtil;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.InputStream;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class qq {


    @Test
    public void show()throws Exception{
       SqlSession sqlSession= MyBatusUtil.createSqlSession();
        int count=sqlSession.getMapper(T_Sys_UserMapper.class).getConn();
        System.out.println("数量是:"+count);
        MyBatusUtil.closeSqlSession(sqlSession);
    }
    @Test
    public void bb(){
        SqlSession sqlSession=MyBatusUtil.createSqlSession();
        List<T_Sys_User> usersList=sqlSession.getMapper(T_Sys_UserMapper.class).getAll();
        for (int i=0;i<usersList.size();i++){
            System.out.println(usersList.get(i).getRealname());
        }
        MyBatusUtil.closeSqlSession(sqlSession);
    }
    @Test
    public void cc(){
        SqlSession sqlSession= MyBatusUtil.createSqlSession();
        Map<String,Object> map=new HashMap<String, Object>();
        map.put("xingming","李");
        map.put("xingbie",1);

        List<T_Sys_User> userList=sqlSession.getMapper(T_Sys_UserMapper.class).getByName(map);
        for (int i=0;i<userList.size();i++){
            System.out.println(userList.get(i).getRealname());
        }
        MyBatusUtil.closeSqlSession(sqlSession);
    }
    @Test
    public void dd(){
        SqlSession sqlSession= MyBatusUtil.createSqlSession();
        List<T_Sys_User> userList=sqlSession.getMapper(T_Sys_UserMapper.class).getNameAndRoleName("李",1);
        for (int i=0;i<userList.size();i++){
            System.out.println(userList.get(i).getRealname()+"\t"+userList.get(i).getGetRolen().getRolename()
            +"\t"+userList.get(i).getGetRolen().getCode());
        }
        MyBatusUtil.closeSqlSession(sqlSession);
    }
    @Test
    public void ee(){
        SqlSession sqlSession=MyBatusUtil.createSqlSession();
        List<T_Sys_User>userList=sqlSession.getMapper(T_Sys_UserMapper.class).getNameAndRoleName("李",1);
        for (int i=1;i<userList.size();i++){
            System.out.println(userList.get(i).getRealname());
            List<T_Address>addressList=userList.get(i).getAddressList();
            for (int j=0;j<addressList.size();j++){
                System.out.println(addressList.get(j).getContact()+"\t"+addressList.get(j).getAddressdesc()+"\t"+addressList.get(j).getTel());

            }
            MyBatusUtil.closeSqlSession(sqlSession);
        }
    }
    @Test
    public void testAdd(){
        SqlSession sqlSession=MyBatusUtil.createSqlSession();
        T_Sys_User user=new T_Sys_User();
        user.setAccount("666");
        user.setRealname("aaa");
        user.setPassword("111");
        user.setPhone("1234567");
        user.setRoleid(3);
        user.setCreateduserid(1);
        user.setCreatedtime(new Date());
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        Date d1=null;
        try {
            d1=sdf.parse("2000-03-12");
        } catch (ParseException e) {
            e.printStackTrace();
        }
        user.setBirthday(d1);
        user.setAddress("你猜");
        user.setSex(1);
        int count=sqlSession.getMapper(T_Sys_UserMapper.class).add(user);
        if (count>0){
            sqlSession.commit();
            System.out.println("新增成功");
        }else {
            sqlSession.rollback();
            System.out.println("新增失败");
        }
    }
    @Test
    public void testDel(){
        SqlSession sqlSession=MyBatusUtil.createSqlSession();
        int count=sqlSession.getMapper(T_Sys_UserMapper.class).delete(19L);
        if (count>0){
            System.out.println("删除成功");
            sqlSession.commit();
        }else {
            System.out.println("删除失败");
            sqlSession.rollback();
        }
        MyBatusUtil.closeSqlSession(sqlSession);
    }
    public void testUpdate(){
        SqlSession sqlSession=MyBatusUtil.createSqlSession();
        T_Sys_User user=new T_Sys_User();
        user.setUpdateduserid(1);
        user.setUpdatedtime();
    }
}

