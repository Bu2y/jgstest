package com.test.dao.impl;

import com.test.dao.BaseDao;
import com.test.dao.userinfodao;
import com.test.entity.Userinfo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class userinfodaoimlp extends BaseDao implements userinfodao {
    Connection conn;
    PreparedStatement pstmt;
    ResultSet rs;
    @Override
    public Userinfo findUser(String name,String pwd){
        Userinfo userinfo = new Userinfo();
        try {
            conn=getConn();
            String sql = "SELECT * FROM userinfo WHERE username=? AND password=?";
            pstmt=conn.prepareStatement(sql);
            pstmt.setString(1,name);
            pstmt.setString(2,pwd);
            rs=pstmt.executeQuery();
            if (rs.next()){
                if (name.equals(rs.getString("Username")) && pwd.equals(rs.getString("Password"))){
                    userinfo.setUsername(rs.getString("Username"));
                    userinfo.setPassword(rs.getString("Password"));
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            closeAll(conn,pstmt,rs);
        }
        return userinfo;
    }
    @Override
    public int add(Userinfo userinfo){
        int count = 0;
        try {
            conn=getConn();
            String sql = "INSERT INTO userinfo VALUE (?,?,?)";
            pstmt=conn.prepareStatement(sql);
            pstmt.setString(1,userinfo.getUsername());
            pstmt.setString(2,userinfo.getPassword());
            pstmt.setString(3,userinfo.getEmail());
            count=pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            closeAll(conn,pstmt,rs);
        }
        return count;
    }

    @Override
    public int getbyname(String name){
        int count = 0;
        try {
            conn=getConn();
            String sql = "SELECT * from userinfo WHERE username=?";
            pstmt=conn.prepareStatement(sql);
            pstmt.setString(1,name);
            rs = pstmt.executeQuery();
            if (rs.next()){
                count = 1;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            closeAll(conn,pstmt,rs);
        }
        return count;
    }
}
