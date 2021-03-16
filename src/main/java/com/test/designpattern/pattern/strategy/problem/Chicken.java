package com.test.designpattern.pattern.strategy.problem;

public class Chicken extends Bird implements AttackAble {
    public Chicken(String name) {
        super(name);
    }

    @Override
    public void speak() {
        System.out.println("꽥꼬닭");
    }

    @Override
    public void move() {
        System.out.println("걷기");
        // 만약 점프가 추가 된다면?
    }

    @Override
    public void attack() {
        System.out.println("부리 공격");
    }
}
