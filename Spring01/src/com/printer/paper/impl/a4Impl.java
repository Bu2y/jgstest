package com.printer.paper.impl;

import com.printer.paper.a4;

public class a4Impl implements a4 {
    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    private String size;
    @Override
    public String a4() {
        return size;
    }
}
