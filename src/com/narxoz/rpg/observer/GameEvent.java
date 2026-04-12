package com.narxoz.rpg.observer;

public class GameEvent {
    private final GameEventType type;
    private final String message;
    private final int value;

    public GameEvent(GameEventType type, String message, int value) {
        this.type = type;
        this.message = message;
        this.value = value;
    }

    public GameEventType getType() { return type; }
    public String getMessage() { return message; }
    public int getValue() { return value; }
}