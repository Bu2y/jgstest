package com.test.dao.impl;

import com.test.dao.BaseDao;
import com.test.dao.MsgDao;
import com.test.entity.Msg;
import com.test.util.PageBean;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MsgDaoImpl extends BaseDao implements MsgDao {
    Connection conn;
    PreparedStatement pstmt;
    ResultSet rs;
    @Override
        public List<Msg> selectAll(PageBean pageBean, String name/*String username*/) {
        List<Msg> list = new ArrayList<>();
        conn =getConn();
        try {
            String sql="select * from msg where sendto=? limit ?,?";
            pstmt=conn.prepareStatement(sql);
            pstmt.setString(1,name);
//            pstmt.setString(2,username);
            pstmt.setInt(2,(pageBean.getPageIndex()-1)*pageBean.getPageSize());
            pstmt.setInt(3,pageBean.getPageSize());
            rs=pstmt.executeQuery();

            while (rs.next()){
                Msg msg = new Msg();
                msg.setMsgid(rs.getLong("msgid"));
                msg.setUsername(rs.getString("username"));
                msg.setTitle(rs.getString("title"));
                msg.setMsgcontent(rs.getString("msgcontent"));
                msg.setState(rs.getLong("state"));
                msg.setSendto(rs.getString("sendto"));
                msg.setMsg_create_date(rs.getDate("msg_create_date"));
                list.add(msg);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            closeAll(conn,pstmt,rs);
        }
        return list;
    }

    @Override
    public int getCount(String name/*String username*/) {
       int count=0;
       conn=getConn();
        try {
            String sql ="select count(1) from msg where sendto=?";
            pstmt=conn.prepareStatement(sql);
            pstmt.setString(1,name);
//            pstmt.setString(2,username);
            rs=pstmt.executeQuery();
            if (rs.next()){
                count=rs.getInt(1);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return count;
    }

    @Override
    public Msg getIdName(int id) {
        Msg msg=null;
        conn=getConn();
        try {
            String sql ="select * from msg where msgid=?";
            pstmt=conn.prepareStatement(sql);
            pstmt.setInt(1,id);
            rs=pstmt.executeQuery();
            if (rs.next()){
                msg=new Msg();
                msg.setMsgid(rs.getLong("msgid"));
                msg.setUsername(rs.getString("username"));
                msg.setTitle(rs.getString("title"));
                msg.setMsgcontent(rs.getString("msgcontent"));
                msg.setState(rs.getLong("state"));
                msg.setSendto(rs.getString("sendto"));
                msg.setMsg_create_date(rs.getDate("msg_create_date"));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            closeAll(conn,pstmt,rs);
        }

        return msg;
    }

    @Override
    public int getdelId(int id) {
        conn=getConn();
        int count=0;
        try {
            String sql = "delete from msg where msgid=?";
            pstmt=conn.prepareStatement(sql);
            pstmt.setInt(1,id);
            count=pstmt.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            closeAll(conn,pstmt,rs);
        }
        return count;
    }

    @Override
    public int getUpdate(int id) {
        int count=0;
        conn=getConn();
        try {
            String sql ="update msg set state=1 where msgid=?";
            pstmt=conn.prepareStatement(sql);
            pstmt.setInt(1,id);
            count=pstmt.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            closeAll(conn,pstmt,rs);
        }
        return count;
    }

    @Override
    public int getInsert(Msg msg) {
        int count=0;
        conn=getConn();
        try {
            String sql="insert into msg values(0,?,?,?,0,?,NOW())";
            pstmt=conn.prepareStatement(sql);
            pstmt.setString(1,msg.getUsername());
            pstmt.setString(2,msg.getTitle());
            pstmt.setString(3,msg.getMsgcontent());
            pstmt.setString(4,msg.getSendto());
            count=pstmt.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            closeAll(conn,pstmt,rs);
        }
        return count;
    }
}
