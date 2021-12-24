package com.bianlidian.mapper;

import com.bianlidian.pojo.T_Sys_User;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface T_Sys_UserMapper {


    public int getConn();

    public List<T_Sys_User> getAll();

   //public List<T_Sys_User> getByName(@Param("name")String name,@Param("sex")int sex);
    public List<T_Sys_User> getByName(Map<String,Object>map);

    public List<T_Sys_User> getNameAndRoleName(@Param("name")String name,@Param("sex")int sex);

    public int add(T_Sys_User t_sys_user);
    public int delete (@Param("id") Long id);
    public int setUpdatedtime(@Param("id")long id);
}
