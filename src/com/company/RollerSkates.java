package com.company;

public class RollerSkates extends Vehicle {
    @Override
    public void move(int id) {
        System.out.println("Роликовые коньки №" + id + " выехали.");
    }
}
