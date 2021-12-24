package com;

import com.dao.Computer;

public class test {
    public static void main(String[] args){
        ComputerFactory computerFactory = new ComputerFactory();
        Computer computer1 = computerFactory.produce("TSComputer");
        computer1.work();

        Computer computer2 = computerFactory.produce("BJBComputer");
        computer2.work();

        Computer computer3 = ComputerFactory2.produce("TSComputer");
        computer3.work();
    }
}
