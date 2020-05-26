package com.company;

public class Bus extends Machine {

    public int amountOfPassengers;
    public Bus(String name, int maxSpeed, int weight, int amountOfPassengers) {
        super(name, maxSpeed, weight);
        this.amountOfPassengers = amountOfPassengers;
    }

    public int getAmountOfPassengers(){return amountOfPassengers;}

    @Override
    public void move(int id) {
        System.out.println("Автобус №" + id + " (" + show() + ") поехал.");
    }
}
