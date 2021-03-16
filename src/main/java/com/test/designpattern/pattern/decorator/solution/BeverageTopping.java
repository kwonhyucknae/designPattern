package com.test.designpattern.pattern.decorator.solution;

public abstract class BeverageTopping extends Beverage {

    private Beverage beverage;

    public BeverageTopping(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getName() {
        return beverage.getName();
    }
}
