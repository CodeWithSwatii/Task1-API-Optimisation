package com.example.containerplacement.model;

import java.util.List;

public class PlacementRequest {
    private Container container;
    private List<YardSlot> yardMap;

    // Getters and Setters
    public Container getContainer() {
        return container;
    }
    public void setContainer(Container container) {
        this.container = container;
    }
    public List<YardSlot> getYardMap() {
        return yardMap;
    }
    public void setYardMap(List<YardSlot> yardMap) {
        this.yardMap = yardMap;
    }
}
