package com.test.designpattern.pattern.strategy.solution.handler.attack;

public class AttackWithMouth implements AttackHandler {

    @Override
    public void attack() {
        System.out.println("부리 공격");
    }
}
