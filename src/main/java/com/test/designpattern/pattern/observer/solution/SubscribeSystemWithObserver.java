package com.test.designpattern.pattern.observer.solution;

import java.util.ArrayList;
import java.util.List;

public class SubscribeSystemWithObserver implements Subject {

    List<NotifyObserver> notifyObserverListener = new ArrayList<>();

    public void setSubscribe() {
        notifyObserver();
    }

    @Override
    public void registerObserver(NotifyObserver notifyObserver) {
        notifyObserverListener.add(notifyObserver);
    }

    @Override
    public void removeObserver(NotifyObserver notifyObserver) {
        notifyObserverListener.remove(notifyObserver);
    }

    @Override
    public void notifyObserver() {
        notifyObserverListener.stream().forEach((element) -> {
            element.send();
        });
    }
}
