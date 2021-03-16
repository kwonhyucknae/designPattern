package com.test.designpattern.pattern.factory;

import com.test.designpattern.pattern.factory.solution.*;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FactoryRunner implements ApplicationRunner {
    public static void main(String[] args) {
        SpringApplication.run(FactoryRunner.class, args);
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        // without factory
        CoffeeMachine coffeeMachineHarder = new CoffeeMachine(new HarderCoffeeGrinder());
        CoffeeMachine coffeeMachineWeak = new CoffeeMachine(new WeakCoffeeGrinder());
        CoffeeMachine coffeeMachineNormal = new CoffeeMachine(new NormalCoffeeGrinder());

        coffeeMachineHarder.grindCoffeeBean();
        coffeeMachineWeak.grindCoffeeBean();
        coffeeMachineNormal.grindCoffeeBean();


        // with factory
        GrinderFactory grinderFactory = new GrinderFactory();

        CoffeeMachine coffeeMachineHarderFactory = new CoffeeMachine(grinderFactory.getGrinder("Hard"));
        CoffeeMachine coffeeMachineWeakFactory = new CoffeeMachine(grinderFactory.getGrinder("Weak"));
        CoffeeMachine coffeeMachineNormalFactory = new CoffeeMachine(grinderFactory.getGrinder("Normal"));

        coffeeMachineHarderFactory.grindCoffeeBean();
        coffeeMachineWeakFactory.grindCoffeeBean();
        coffeeMachineNormalFactory.grindCoffeeBean();
    }
}
