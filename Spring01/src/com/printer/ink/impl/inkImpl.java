package com.printer.ink.impl;

import com.printer.ink.ink;

public class inkImpl implements ink {
    public String getCcolor() { return ccolor; }
    public void setCcolor(String ccolor) { this.ccolor = ccolor; }
    private String ccolor;
    @Override
    public String getColor() {
        return ccolor;
    }
}
