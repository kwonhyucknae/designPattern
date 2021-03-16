package com.test.designpattern.pattern.strategy.solution;

import com.test.designpattern.pattern.strategy.solution.handler.move.MoveHandler;

public abstract class BirdWithStrategy {
    private String name;
    private MoveHandler moveHandler;

    public BirdWithStrategy(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void performMove() {
        moveHandler.move();
    }

    public void setMoveHandler(MoveHandler moveHandler) {
        this.moveHandler = moveHandler;
    }

    public abstract void speak();
}
