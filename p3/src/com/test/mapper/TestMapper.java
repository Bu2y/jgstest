package com.test.mapper;



import com.test.entity.T_Supplier;
import com.test.entity.T_Sys_User;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface TestMapper {
    public int count();
    public List<T_Sys_User> getall();
    public List<T_Sys_User> byid(@Param("name")String name,@Param("sex")int sex);
//    public List<T_Sys_User> getbyname(Map<String,Object>);
    public int all();
    public List<T_Sys_User> ljcx(@Param("name") String name,@Param("sex") int sex);
    public List<T_Sys_User> dzcx(@Param("name") String name,@Param("sex") int sex);
    public int add(T_Sys_User t_sys_user);
    public int del(Long id);
    public List<T_Sys_User> cx(@Param("name")String name,@Param("roleid")Long id);
    public List<T_Sys_User> getbyroleid (List<Integer> roleids);
    public List<T_Sys_User> getbyroleidArray (Integer[] roleids);
    public List<T_Sys_User> fenye(@Param("name") String name,@Param("pagestar") Integer pagestar,@Param("pagesize") Integer pagesize);
}
