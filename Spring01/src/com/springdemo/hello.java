package com.springdemo;

import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class hello {
    public HelloSpring getHelloSpring1() {
        return helloSpring1;
    }

    public void setHelloSpring1(HelloSpring helloSpring1) {
        this.helloSpring1 = helloSpring1;
    }

    public HelloSpring getHelloSpring2() {
        return helloSpring2;
    }

    public void setHelloSpring2(HelloSpring helloSpring2) {
        this.helloSpring2 = helloSpring2;
    }

    private HelloSpring helloSpring1;
    private HelloSpring helloSpring2;
    private List<String> list;
    private Set<String> set;
    private String[] arrays;
    private Map<String,String> map;
    private Properties properties;

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public Set<String> getSet() {
        return set;
    }

    public void setSet(Set<String> set) {
        this.set = set;
    }

    public String[] getArrays() {
        return arrays;
    }

    public void setArrays(String[] arrays) {
        this.arrays = arrays;
    }

    public Map<String, String> getMap() {
        return map;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }



    public void show(){
//        System.out.println( helloSpring1.getHello());
//        System.out.println(helloSpring2.getHello());
        System.out.println(list.size());
        System.out.println(set.size());
        System.out.println(arrays.length);
        System.out.println(map.size());
        System.out.println(properties.toString());
    }
}
