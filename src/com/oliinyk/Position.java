package com.oliinyk;

public abstract class Position implements Cloneable {

    protected String name;
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void work(){
        System.out.println(name + " works");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object clone = null;
        return super.clone();
    }
}
