package com.test.designpattern.pattern.observer.solution;

public interface Subject {
    void registerObserver(NotifyObserver notifyObserver);
    void removeObserver(NotifyObserver notifyObserver);
    void notifyObserver();
}
