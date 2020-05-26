package com.company;

public class Jumpers extends Vehicle {
    @Override
    public void move(int id) {
        System.out.println("Джамперы №" + id + " выехали.");
    }
}
