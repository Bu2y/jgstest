package com.news.dao.Impl;

import com.news.dao.BaseDao;
import com.news.dao.Newsuserdao;
import com.news.entity.Newsuser;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class NewsuserImpl extends BaseDao implements Newsuserdao {
    Connection conn = getConn();
    PreparedStatement pstmt;
    ResultSet rs;
    @Override
    public int add(Newsuser newsuser) {
        int count=0;
        //获取连接
        try {
            conn=getConn();
            //定义sql
            String sql="insert into newsuser values(0,?,?)";
            //创建pstmt
            pstmt=conn.prepareStatement(sql);
            pstmt.setString(1, newsuser.getUsername());
            pstmt.setString(2, newsuser.getUpwd());

            //执行sql,返回结果
            count=pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            closeAll(conn, pstmt, rs);
        }
        return count;

    }
    @Override
    public int cz(Newsuser newsuser){
        int count=0;
        try {
            conn=getConn();
            String sql="SELECT * FROM newsuser WHERE username=? AND upwd=?";
            pstmt=conn.prepareStatement(sql);
            pstmt.setString(1,newsuser.getUsername());
            pstmt.setString(2,newsuser.getUpwd());
            rs=pstmt.executeQuery();
            if (rs.getString("username").equals(newsuser.getUsername()) || rs.getString("upwd").equals(newsuser.getUpwd())){
                count=1;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return count;
    }
}
