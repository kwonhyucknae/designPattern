package com.test.designpattern.pattern.observer.problem;


public class SubscribeSystem {
    SmsNotification smsNotification;
    EmailNotification emailNotification;

    public SubscribeSystem(SmsNotification smsNotification, EmailNotification emailNotification) {
        this.smsNotification = smsNotification;
        this.emailNotification = emailNotification;
    }

    public void sendNotification() {
        smsNotification.send();
        emailNotification.send();
    }
}
