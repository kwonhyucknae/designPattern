package com.test.designpattern.pattern.strategy.problem;

public abstract class Bird {
    private String name;

    public Bird(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void speak();

    public abstract void move();
}
