package com.test.designpattern.pattern.observer.solution;

public class KakaoNotificationWithObserver implements NotifyObserver {
    public void send() {
        System.out.println("카톡 전송");
    }

}
