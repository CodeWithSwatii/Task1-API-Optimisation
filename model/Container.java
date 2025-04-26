package com.example.containerplacement.model;

public class Container {
    private String id;
    private String size; // "small" or "big"
    private boolean needsCold;
    private int x;
    private int y;

    // Getters and Setters
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getSize() {
        return size;
    }
    public void setSize(String size) {
        this.size = size;
    }
    public boolean isNeedsCold() {
        return needsCold;
    }
    public void setNeedsCold(boolean needsCold) {
        this.needsCold = needsCold;
    }
    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }
}
