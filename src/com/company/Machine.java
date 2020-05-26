package com.company;

public abstract class Machine implements Run {
    public String name;
    public int maxSpeed;
    public int weight;

    public Machine(String name, int maxSpeed, int weight) {
        this.name = name;
        this.maxSpeed = maxSpeed;
        this.weight = weight;
    }

    @Override
    public String show() {
        return name;
    }

    @Override
    public int getMaxSpeed() {
        return maxSpeed;
    }

    @Override
    public int getWeightOfTransport() {
        return weight;
    }

    @Override
    public abstract void move(int id);
}
