package com.narxoz.rpg.combatant;

import com.narxoz.rpg.strategy.CombatStrategy;
import com.narxoz.rpg.strategy.StandardStrategy;

public class DungeonBoss {
    private int health;
    private CombatStrategy strategy;

    public DungeonBoss(int health) {
        this.health = health;
        this.strategy = new StandardStrategy();
    }

    public void setStrategy(CombatStrategy strategy) {
        this.strategy = strategy;
    }

    public int getHealth() {
        return health;
    }

    public void takeDamage(int amount) {
        this.health -= amount;
    }

    public int attack(int baseDamage) {
        return strategy.calculateDamage(baseDamage);
    }
}