package com.company;

public class TractorWheel extends Tractor {

    public TractorWheel(String name, int maxSpeed, int weight) {
        super(name, maxSpeed, weight, "Wheel");
    }

    @Override
    public void move(int id) {
        System.out.println("Колёсный трактор №" + id + " (" + show() + ") поехал.");
    }
}
