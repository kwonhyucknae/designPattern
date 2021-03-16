package com.test.designpattern.pattern.strategy.solution.handler.move;

public class MoveWithJump implements MoveHandler {
    @Override
    public void move() {
        System.out.println("걷기 And 점프");
    }
}
