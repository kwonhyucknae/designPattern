package com.test.designpattern.pattern.strategy.problem;

public class Penguin extends Bird {
    public Penguin(String name) {
        super(name);
    }

    @Override
    public void speak() {
        System.out.println("펭펭");
    }

    @Override
    public void move() {
        System.out.println("걷기");
    }
}
