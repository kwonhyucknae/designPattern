package com.test.designpattern.pattern.strategy;

import com.test.designpattern.pattern.strategy.solution.ChickenWithStrategy;
import com.test.designpattern.pattern.strategy.solution.handler.attack.AttackWithMouth;
import com.test.designpattern.pattern.strategy.solution.handler.move.MoveWithFly;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StrategyRunner implements ApplicationRunner {
    public static void main(String[] args) {
        SpringApplication.run(StrategyRunner.class, args);
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        ChickenWithStrategy chicken = new ChickenWithStrategy("chicken");
        chicken.setAttackAble(new AttackWithMouth());
        chicken.setMoveHandler(new MoveWithFly());

        chicken.performMove();
        chicken.performAttack();
    }
}
