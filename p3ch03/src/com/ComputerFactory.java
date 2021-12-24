package com;

import com.dao.Computer;
import com.dao.impl.BJBComputer;
import com.dao.impl.TSComputer;

public class ComputerFactory {

    public Computer produce(String s){
        Computer computer = null;
        if (s.equals("TSComputer")){
         computer = new TSComputer();
        }else if (s.equals("BJBComputer")){
            computer = new BJBComputer();
        }else {
            System.out.println("不能生产");
        }
        return computer;
    }

}
