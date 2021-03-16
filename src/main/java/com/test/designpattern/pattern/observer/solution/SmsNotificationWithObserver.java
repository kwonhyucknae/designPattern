package com.test.designpattern.pattern.observer.solution;

public class SmsNotificationWithObserver implements NotifyObserver {
    public void send() {
        System.out.println("Sms 메시지 전송");
    }
}
