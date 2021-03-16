package com.test.designpattern.pattern.factory.solution;

public class CoffeeMachine {
    CoffeeGrinder coffeeGrinder;

    public CoffeeMachine(CoffeeGrinder coffeeGrinder) {
        this.coffeeGrinder = coffeeGrinder;
    };

    public void grindCoffeeBean() {
        coffeeGrinder.grindCoffee();
    }

    public void makeCoffee() {
        System.out.println("커피 생성");
    }
}
