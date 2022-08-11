package com.spring5.ioc;

public class Book {
    private String bname;
    private int bprice;

    public void setBname(String bname) {
        this.bname = bname;
    }

    public void setBprice(int bprice) {
        this.bprice = bprice;
    }

    @Override
    public String toString() {
        return bname + "   "+ bprice;
    }
}
