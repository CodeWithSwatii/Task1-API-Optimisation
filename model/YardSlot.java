package com.example.containerplacement.model;

public class YardSlot {
    private int x;
    private int y;
    private String sizeCap; // "small" or "big"
    private boolean hasColdUnit;
    private boolean occupied;

    // Getters and Setters
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
    public String getSizeCap() {
        return sizeCap;
    }
    public void setSizeCap(String sizeCap) {
        this.sizeCap = sizeCap;
    }
    public boolean isHasColdUnit() {
        return hasColdUnit;
    }
    public void setHasColdUnit(boolean hasColdUnit) {
        this.hasColdUnit = hasColdUnit;
    }
    public boolean isOccupied() {
        return occupied;
    }
    public void setOccupied(boolean occupied) {
        this.occupied = occupied;
    }
}
