package com.test.util;

import com.test.entity.Msg;

import java.util.List;

public class PageBean {
    private  int pageSize=5;//每页显示条数
    private int pageIndex=1;//当前页数
    private int totalpage;//总页数
    private int allRows;//总条数
    private List<Msg> pageList;//集合



    public int getTotalpage() {
        return allRows%pageSize==0?allRows/pageSize:allRows/pageSize+1;
    }
    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getPageIndex() {
        return pageIndex;
    }

    public void setPageIndex(int pageIndex) {
        this.pageIndex = pageIndex;
    }


    public void setTotalpage(int totalpage) {
        this.totalpage = totalpage;
    }

    public int getAllRows() {
        return allRows;
    }

    public void setAllRows(int allRows) {
        this.allRows = allRows;
    }

    public List<Msg> getPageList() {
        return pageList;
    }

    public void setPageList(List<Msg> pageList) {
        this.pageList = pageList;
    }
}
