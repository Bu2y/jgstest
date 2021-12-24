package com.news.dao.impl;

import com.news.dao.BaseDao;
import com.news.dao.textdao;
import com.news.entity.test;
import com.news.entity.zhuti;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class textdaoImpl extends BaseDao implements textdao {
    Connection conn = getConn();
    PreparedStatement pstmt;
    ResultSet rs;

    @Override
    public  int xg(test test){
        int count = 0;
        try {
            conn=getConn();
            String sql = "";
            pstmt=conn.prepareStatement(sql);
            pstmt.setString(1,test.getUsername());
            pstmt.setString(2,test.getUpwd());
            rs=pstmt.executeQuery();
            if (rs.next()){
                count=1;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            closeAll(conn,pstmt,rs);
        }


        return 0;
    }

    @Override
    public List<zhuti> bdgs(){
        List<zhuti> zt = new ArrayList<zhuti>();

        try {
            conn=getConn();
            String sql = "SELECT * FROM a2";
            pstmt=conn.prepareStatement(sql);
            rs=pstmt.executeQuery();

            while (rs.next()){
                zhuti zhuti = new zhuti();
                zhuti.setZt(rs.getString("zt"));
                zt.add(zhuti);


            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return zt;
    }

    @Override
    public int cx(test test) {
        int count = 0;
        try {
            conn=getConn();
            String sql = "select * from `newsuser` WHERE uname=? AND upwd=?";
            pstmt=conn.prepareStatement(sql);
            pstmt.setString(1,test.getUsername());
            pstmt.setString(2,test.getUpwd());
            rs=pstmt.executeQuery();
            if (rs.next()){
                count=1;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            closeAll(conn,pstmt,rs);
        }


        return count;
    }


}
