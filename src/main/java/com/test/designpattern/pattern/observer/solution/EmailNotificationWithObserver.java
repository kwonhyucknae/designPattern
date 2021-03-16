package com.test.designpattern.pattern.observer.solution;

public class EmailNotificationWithObserver implements NotifyObserver {
    public void send() {
        System.out.println("Email 전송");
    }

}
