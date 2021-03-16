package com.test.designpattern.pattern.decorator.solution;

public class Chocolate extends BeverageTopping {

    public Chocolate(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getName() {
        return super.getName() + " 초콜렛 추가";
    }
}
