package com.bianlidian.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;


import java.io.InputStream;

public class MyBatusUtil {
    //单例模式（应用程序运行过程中只有一个factory实例）
    private static SqlSessionFactory factory;
    static {
        try {
            InputStream is= Resources.getResourceAsStream("mybatis-config.xml");
            factory=new SqlSessionFactoryBuilder().build(is);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    //创建sqlsession对象
    public static SqlSession createSqlSession(){
        return factory.openSession();
    }
    //关闭sqlsessionry
    public static void closeSqlSession(SqlSession sqlSession){
        if (sqlSession!=null){
            sqlSession.close();
        }
    }
}
