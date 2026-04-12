package com.narxoz.rpg.strategy;

public class StandardStrategy implements CombatStrategy {
    @Override
    public int calculateDamage(int baseDamage) {
        return baseDamage;
    }
}