package com.printer.dayinji;


import com.printer.ink.ink;
import com.printer.paper.a4;

public class dayinji {
    public com.printer.paper.a4 getA4() { return a4; }

    public void setA4(com.printer.paper.a4 a4) { this.a4 = a4; }

    private a4 a4;

    public com.printer.ink.ink getInk() { return ink; }

    public void setInk(com.printer.ink.ink ink) { this.ink = ink; }
    private ink ink;
    public void show(){
        System.out.println("墨盒:"+ink.getColor()+"纸张:"+a4.a4());
    }
}
