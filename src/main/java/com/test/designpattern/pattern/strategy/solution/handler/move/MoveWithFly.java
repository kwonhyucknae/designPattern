package com.test.designpattern.pattern.strategy.solution.handler.move;

public class MoveWithFly implements MoveHandler {
    @Override
    public void move() {
        System.out.println("걷기 and 날기");
    }
}
