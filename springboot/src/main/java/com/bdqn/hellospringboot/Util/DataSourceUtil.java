package com.bdqn.hellospringboot.Util;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;

import javax.sql.DataSource;

public class DataSourceUtil {
    @Autowired
    private DataSource dataSource;

    public SqlSessionFactory sqlSessionFactoryBeen(){
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        try {
            sqlSessionFactoryBean.setTypeAliasesPackage("com.bdqn.hellospringboot.entity");
            return sqlSessionFactoryBean.getObject();
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException();
        }
    }
}
