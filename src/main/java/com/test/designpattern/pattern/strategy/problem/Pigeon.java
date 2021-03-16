package com.test.designpattern.pattern.strategy.problem;

public class Pigeon extends Bird {

    public Pigeon(String name) {
        super(name);
    }

    @Override
    public void speak() {
        System.out.println("구구구");
    }

    @Override
    public void move() {
        System.out.println("걷기 and 날기");
    }
}
