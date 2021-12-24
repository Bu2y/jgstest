package com.test.dao.impl;

import com.test.dao.BaseDao;
import com.test.dao.UserinfoDao;
import com.test.entity.Userinfo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserinfoDaoImpl extends BaseDao implements UserinfoDao {
    Connection conn;
    PreparedStatement pstmt;
    ResultSet rs;

    /**
     * 新增用户信息
     * @param userinfo
     * @return
     */
    @Override
    public int addUser(Userinfo userinfo) {
        int count=0;
        conn=getConn();
        try {
            String sql = "insert into userinfo values(?,?,?)";
            pstmt=conn.prepareStatement(sql);
            pstmt.setString(1,userinfo.getUsername());//用户名
            pstmt.setString(2,userinfo.getPassword());//密码
            pstmt.setString(3,userinfo.getEmail());//邮箱地址
            count=pstmt.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            closeAll(conn,pstmt,rs);
        }
        return count;
    }

    /**
     * 用户登录
     * @param username
     * @param password
     * @return
     */
    @Override
    public List<Userinfo> denlu(String username, String password) {
        List<Userinfo> list = new ArrayList<>();
        conn=getConn();
        try {
            String sql = "select * from userinfo where username=? and password=?";
            pstmt=conn.prepareStatement(sql);
            pstmt.setString(1,username);
            pstmt.setString(2,password);
            rs=pstmt.executeQuery();
            while (rs.next()){
             Userinfo userinfo = new Userinfo();
             userinfo.setUsername(rs.getString("username"));
             userinfo.setPassword(rs.getString("password"));
             list.add(userinfo);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            closeAll(conn,pstmt,rs);
        }
        return list;
    }

    @Override
    public int getByname(String username) {
        int count =0;
        conn=getConn();
        try {
            String sql="select count(1) from userinfo where username=?";
            pstmt=conn.prepareStatement(sql);
            pstmt.setString(1,username);
            rs=pstmt.executeQuery();
            if (rs.next()){
                count=rs.getInt(1);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            closeAll(conn,pstmt,rs);
        }
        return count;
    }

    @Override
    public List<Userinfo> userAll() {
        List<Userinfo> list = new ArrayList<>();
        conn=getConn();
        try {
            String sql = "select * from userinfo";
            pstmt=conn.prepareStatement(sql);
            rs=pstmt.executeQuery();
            while (rs.next()){
                Userinfo userinfo = new Userinfo();
                userinfo.setUsername(rs.getString("username"));
                userinfo.setPassword(rs.getString("password"));
                userinfo.setEmail(rs.getString("email"));
                list.add(userinfo);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            closeAll(conn,pstmt,rs);
        }
        return list;
    }
}
