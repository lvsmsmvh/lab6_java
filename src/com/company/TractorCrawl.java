package com.company;

public class TractorCrawl extends Tractor {

    public TractorCrawl(String name, int maxSpeed, int weight) {
        super(name, maxSpeed, weight, "Crawl");
    }

    @Override
    public void move(int id) {
        System.out.println("Гусеничный трактор №" + id + " (" + show() + ") поехал.");
    }
}
