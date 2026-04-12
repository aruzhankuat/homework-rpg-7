package com.narxoz.rpg.observer;

import java.util.ArrayList;
import java.util.List;

public class CombatPublisher {
    private final List<GameObserver> observers = new ArrayList<>();

    public void subscribe(GameObserver observer) {
        observers.add(observer);
    }

    public void notifyObservers(GameEvent event) {
        for (GameObserver observer : observers) {
            observer.onEvent(event);
        }
    }
}