package com.narxoz.rpg.combatant;

public class Hero {
    private int health;
    private String name;

    public Hero(String name, int health) {
        this.name = name;
        this.health = health;
    }

    public int getHealth() {
        return health;
    }

    public void takeDamage(int amount) {
        this.health -= amount;
    }
}
