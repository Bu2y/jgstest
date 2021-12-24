package dao.Impl;

import dao.BaseDao;
import dao.WorkingDao;
import entity.Working;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class WorkingDaoImpl extends BaseDao implements WorkingDao {
    Connection conn = null;
    PreparedStatement pstmt=null;
    ResultSet rs=null;
    @Override
    public int add(Working working) {
        int count=0;
        try {
            conn=getConn();
            String sql="insert into working values(0,?,?,now(),?)";
            pstmt=conn.prepareStatement(sql);
            pstmt.setString(1,working.getTitle());
            pstmt.setString(2,working.getContent());
            //类型转换
            pstmt.setInt(3,working.getType());
            count=pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }  finally {
            closeAll(conn,pstmt,rs);
        }
        return count;
    }

    @Override
    public List<Working> getall() {
        List<Working> list=new ArrayList<Working>();
        try {
            conn=getConn();
            String sql="select * from working ORDER BY createDate";
            pstmt=conn.prepareStatement(sql);
            rs=pstmt.executeQuery();
            while (rs.next()){
                Working working = new Working();
                working.setId(rs.getInt("id"));
                working.setTitle(rs.getString("title"));
                working.setContent(rs.getString("content"));
                working.setCreateDate(rs.getDate("createDate"));
                working.setType(rs.getInt("type"));
                list.add(working);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            closeAll(conn,pstmt,rs);
        }
        return list;
    }

    @Override
    public int gettitle(String title) {
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
    public List<Working> getid(int type) {
        List<Working> list=new ArrayList<Working>();
        try {
            conn=getConn();
            String sql="select * from working WHERE id=?";
            pstmt=conn.prepareStatement(sql);
            pstmt.setInt(1,type);
            rs=pstmt.executeQuery();
            while (rs.next()){
                Working working = new Working();
                working.setId(rs.getInt("id"));
                working.setTitle(rs.getString("title"));
                working.setContent(rs.getString("content"));
                working.setCreateDate(rs.getDate("createDate"));
                working.setType(rs.getInt("type"));
                list.add(working);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            closeAll(conn,pstmt,rs);
        }
        return list;
    }
}
