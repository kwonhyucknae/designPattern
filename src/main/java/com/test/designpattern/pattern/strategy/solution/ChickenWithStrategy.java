package com.test.designpattern.pattern.strategy.solution;

import com.test.designpattern.pattern.strategy.solution.handler.attack.AttackHandler;

public class ChickenWithStrategy extends BirdWithStrategy {
    public ChickenWithStrategy(String name) {
        super(name);
    }

    AttackHandler attackHandler;

    @Override
    public void speak() {
        System.out.println("꽥꼬닭");
    }

    public void performAttack() {
        attackHandler.attack();
    }

    public void setAttackAble(AttackHandler attackHandler) {
        this.attackHandler = attackHandler;
    }
}
