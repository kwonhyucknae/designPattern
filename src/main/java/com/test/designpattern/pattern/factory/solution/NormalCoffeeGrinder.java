package com.test.designpattern.pattern.factory.solution;

public class NormalCoffeeGrinder extends CoffeeGrinder {
    @Override
    public void grindCoffee() {
        System.out.println("평범하게 감");
    }
}
