package com.company;

public abstract class Tractor extends Machine {
    private String type; //

    public Tractor(String name, int maxSpeed, int weight, String type) {
        super(name, maxSpeed, weight);
        this.type = type;
    }

    public String getType(){
        return type;
    }
}
