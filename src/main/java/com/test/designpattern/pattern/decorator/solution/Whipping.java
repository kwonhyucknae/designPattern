package com.test.designpattern.pattern.decorator.solution;

public class Whipping extends BeverageTopping {

    public Whipping(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getName() {
        return super.getName() + " νν μΆκ°";
    }
}
