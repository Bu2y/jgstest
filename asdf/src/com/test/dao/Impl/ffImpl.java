package com.test.dao.Impl;

import com.test.dao.BaseDao;
import com.test.dao.ff;
import com.test.entity.lei;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ffImpl extends BaseDao implements ff  {
    Connection conn = null;
    PreparedStatement pstmt=null;
    ResultSet rs=null;
    @Override
    public List<lei> getid(int type){
        List<lei> list=new ArrayList<lei>();
        try {
            conn=getConn();
            String sql="select * from working WHERE id=?";
            pstmt=conn.prepareStatement(sql);
            pstmt.setInt(1,type);
            rs=pstmt.executeQuery();
            while (rs.next()){
                lei lei = new lei();
                lei.setId(rs.getInt("id"));
                lei.setTitle(rs.getString("title"));
                lei.setContent(rs.getString("content"));
                lei.setCreateDate(rs.getDate("createDate"));
                lei.setType(rs.getInt("type"));
                list.add(lei);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            closeAll(conn,pstmt,rs);
        }
        return list;
    }
    @Override
    public int gettitle(String title){
        int count = 0;
        try {
            conn= getConn();
            String sql = "select count(1) from working where title=?";
            pstmt=conn.prepareStatement(sql);
            pstmt.setString(1,title);
            System.out.println(title);
            rs=pstmt.executeQuery();
            if (rs.next()){
                count=rs.getInt(1);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return count;
    }
    @Override
    public int add(lei lei) {
        int count=0;
        try {
            conn=getConn();
            String sql="insert into working values(0,?,?,now(),?)";
            pstmt=conn.prepareStatement(sql);
            pstmt.setString(1,lei.getTitle());
            pstmt.setString(2,lei.getContent());
            //java.sql.Date类型和Java.util.Date类型转换
            pstmt.setInt(3,lei.getType());
            count=pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }  finally {
            closeAll(conn,pstmt,rs);
        }
        return count;

    }

    @Override
    public List<lei> getall() {
        List<lei> list=new ArrayList<lei>();
        try {
            conn=getConn();
            String sql="select * from working";
            pstmt=conn.prepareStatement(sql);
            rs=pstmt.executeQuery();
            while (rs.next()){
               lei lei = new lei();
                lei.setId(rs.getInt("id"));
                lei.setTitle(rs.getString("title"));
                lei.setContent(rs.getString("content"));
                lei.setCreateDate(rs.getDate("createDate"));
                lei.setType(rs.getInt("type"));
                list.add(lei);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            closeAll(conn,pstmt,rs);
        }
        return list;
    }
}
