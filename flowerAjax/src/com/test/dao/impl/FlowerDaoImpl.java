package com.test.dao.impl;



import com.test.dao.BaseDao;
import com.test.dao.FlowerDao;
import com.test.entity.Flower;
import com.test.util.PageBean;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class FlowerDaoImpl extends BaseDao implements FlowerDao {
    Connection conn=null;
    PreparedStatement pstmt=null;
    ResultSet rs=null;
    @Override
    public List<Flower> getAll(PageBean pageBean, String name) {
        List<Flower> flowerList=new ArrayList<Flower>();
        try {
            conn=getConn();
            String sql="select * from flower where name LIKE  ? limit ?,?";
            pstmt=conn.prepareStatement(sql);
            pstmt.setString(1,"%"+name+"%");
            pstmt.setInt(2,(pageBean.getPageIndex()-1)*pageBean.getPageSize());
            pstmt.setInt(3,pageBean.getPageSize());
            rs=pstmt.executeQuery();
            while (rs.next()){
                Flower flower=new Flower();
                flower.setName(rs.getString("name"));
                flowerList.add(flower);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            closeAll(conn,pstmt,rs);
        }
        return flowerList;
    }

    @Override
    public int getCount(String name) {
        int count=0;
        try {
            conn=getConn();
            String sql="select count(1) from flower where name LIKE ?";
            pstmt=conn.prepareStatement(sql);
            pstmt.setString(1,"%"+name+"%");
            rs=pstmt.executeQuery();
            if(rs.next()){
                count=rs.getInt(1);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return count;
    }

    @Override
    public int add(Flower flower) {
        int count=0;
        try {
            conn=getConn();
            String sql="insert into flower values(0,?,?,?,?,?)";
            pstmt=conn.prepareStatement(sql);
            pstmt.setString(1,flower.getName());
            pstmt.setString(2,flower.getAnothername());
            pstmt.setString(3,flower.getProperty());
            pstmt.setDouble(4,flower.getPrice());
            pstmt.setString(5,flower.getProduction());
            count=pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            closeAll(conn,pstmt,rs);
        }
        return count;
    }

    @Override
    public int update(Flower flower) {
        int count=0;
        try {
            conn=getConn();
            String sql="update flower set name=?,anothername=?,property=?,price=?,production=? where id=?";
            pstmt=conn.prepareStatement(sql);
            pstmt.setString(1,flower.getName());
            pstmt.setString(2,flower.getAnothername());
            pstmt.setString(3,flower.getProperty());
            pstmt.setDouble(4,flower.getPrice());
            pstmt.setString(5,flower.getProduction());
            pstmt.setLong(6,flower.getId());
            count=pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            closeAll(conn,pstmt,rs);
        }
        return count;
    }

    @Override
    public int delete(Long id) {
        int count=0;
        try {
            conn=getConn();
            String sql="delete from flower where id=?";
            pstmt=conn.prepareStatement(sql);
            pstmt.setLong(1,id);
            count=pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            closeAll(conn,pstmt,rs);
        }
        return count;
    }
}
