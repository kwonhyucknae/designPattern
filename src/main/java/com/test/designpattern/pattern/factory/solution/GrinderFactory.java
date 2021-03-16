package com.test.designpattern.pattern.factory.solution;


public class GrinderFactory {
    public CoffeeGrinder getGrinder(String type) {
        if (type == "Hard") {
            return new HarderCoffeeGrinder();
        } else if (type == "Weak") {
            return new WeakCoffeeGrinder();
        } else {
            return new NormalCoffeeGrinder();
        }
    }
}
