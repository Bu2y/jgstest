package com.news.dao.impl;

import com.news.dao.BaseDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class resous extends BaseDao {
    Connection conn = getConn();
    PreparedStatement pstmt;
    ResultSet rs;
    public int dl(String name,String pwd){
        int a = 0;
        try {
            conn=getConn();
            String sql = "SELECT * FROM newsuser WHERE username=? AND upwd=?";
            pstmt=conn.prepareStatement(sql);
            pstmt.setString(1,name);
            pstmt.setString(2,pwd);
            rs=pstmt.executeQuery();


        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            closeAll(conn,pstmt,rs);
        }
        return a;
    }


}
