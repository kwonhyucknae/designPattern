package com.test.designpattern.pattern.factory.solution;

public class WeakCoffeeGrinder extends CoffeeGrinder {

    @Override
    public void grindCoffee() {
        System.out.println("약하게 감");
    }
}
