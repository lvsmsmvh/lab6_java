package com.company;

public class Car extends Vehicle {
    @Override
    public void move(int id) {
        System.out.println("Автомобиль №" + id + " выехал.");
    }
}
