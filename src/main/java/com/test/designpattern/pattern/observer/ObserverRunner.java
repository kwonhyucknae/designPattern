package com.test.designpattern.pattern.observer;

import com.test.designpattern.pattern.observer.solution.EmailNotificationWithObserver;
import com.test.designpattern.pattern.observer.solution.KakaoNotificationWithObserver;
import com.test.designpattern.pattern.observer.solution.SmsNotificationWithObserver;
import com.test.designpattern.pattern.observer.solution.SubscribeSystemWithObserver;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ObserverRunner implements ApplicationRunner {
    public static void main(String[] args) {
        SpringApplication.run(ObserverRunner.class, args);
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        SubscribeSystemWithObserver subscribeSystemWithObserver = new SubscribeSystemWithObserver();
        subscribeSystemWithObserver.registerObserver(new EmailNotificationWithObserver());
        subscribeSystemWithObserver.registerObserver(new KakaoNotificationWithObserver());
        subscribeSystemWithObserver.registerObserver(new SmsNotificationWithObserver());

        subscribeSystemWithObserver.setSubscribe();
    }
}
