package com.dao.impl;

import com.dao.Computer;

public class TSComputer implements Computer {
    @Override
    public void work() {
        System.out.println("台式机");
    }
}
