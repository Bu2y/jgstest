package com.bianlidian.mapper;

import com.bianlidian.pojo.T_Sys_User;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;
import java.util.Map;

public class T_Sys_UserMapperImpl extends SqlSessionDaoSupport implements T_Sys_UserMapper {
    @Override
    public int getConn() {
        return this.getSqlSession().selectOne("com.bianlidian.mapper.T_Sys_UserMapper.getConn()");
    }

    @Override
    public List<T_Sys_User> getAll() {
        T_Sys_User t_sys_user = new T_Sys_User();

        return null;
    }

    @Override
    public List<T_Sys_User> getByName(Map<String, Object> map) {
        return null;
    }

    @Override
    public List<T_Sys_User> getNameAndRoleName(String name, int sex) {
        T_Sys_User t_sys_user = new T_Sys_User();
        t_sys_user.setRealname(name);
        t_sys_user.setSex(sex);
        return null;
    }

    @Override
    public int add(T_Sys_User t_sys_user) {
        return 0;
    }

    @Override
    public int delete(Long id) {
        return 0;
    }

    @Override
    public int setUpdatedtime(long id) {
        return 0;
    }
}
