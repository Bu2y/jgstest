package com.test.dao;

import java.sql.Connection;
import java.sql.*;
import java.util.Properties;
import java.io.*;
/**
 * 数据库帮助类
 */
public class BaseDao {
    private static String driver;
    private static String url;
    private static String user;
    private static String password;

    public  static void init(){
        //创建properties对象
        Properties p  = new Properties();
        //保存路径
        String path ="database.properties";
        InputStream is = BaseDao.class.getClassLoader().getResourceAsStream(path);
        try {
            //从输入流中加载properties文件
            p.load(is);
        } catch (IOException e) {
            e.printStackTrace();
        }
        driver=p.getProperty("driver");
        url=p.getProperty("url");
        user=p.getProperty("user");
        password=p.getProperty("password");
    }

    static {
        init();
    }

    Connection conn = null;

    public Connection getConn(){
        if (conn==null){
            try {
                Class.forName(driver);
                conn=DriverManager.getConnection(url,user,password);
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
    return conn;
    }

    public void  closeAll(Connection conn,PreparedStatement pstmt,ResultSet rs){
        try{
            if (conn!=null){
                conn.close();
            }
            if (pstmt!=null){
                pstmt.close();
            }
            if (rs!=null){
                rs.close();
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
