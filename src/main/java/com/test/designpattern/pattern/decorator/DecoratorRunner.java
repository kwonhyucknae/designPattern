package com.test.designpattern.pattern.decorator;

import com.test.designpattern.pattern.decorator.solution.Americano;
import com.test.designpattern.pattern.decorator.solution.Beverage;
import com.test.designpattern.pattern.decorator.solution.Chocolate;
import com.test.designpattern.pattern.decorator.solution.Whipping;
import com.test.designpattern.pattern.factory.solution.*;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DecoratorRunner implements ApplicationRunner {
    public static void main(String[] args) {
        SpringApplication.run(DecoratorRunner.class, args);
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Beverage beverage = new Americano();
        beverage = new Whipping(beverage);
        beverage = new Chocolate(beverage);

        System.out.println(beverage.getName());
    }
}
