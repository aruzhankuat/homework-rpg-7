package com.narxoz.rpg.strategy;

public class BerserkStrategy implements CombatStrategy {
    @Override
    public int calculateDamage(int baseDamage) {
        return baseDamage * 2; // Урон увеличивается в 2 раза
    }
}