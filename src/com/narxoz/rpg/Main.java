package com.narxoz.rpg;

import com.narxoz.rpg.combatant.Hero;
import com.narxoz.rpg.combatant.DungeonBoss;
import com.narxoz.rpg.engine.DungeonEngine;

public class Main {
    public static void main(String[] args) {
        Hero hero = new Hero("Arujan", 100);
        DungeonBoss boss = new DungeonBoss(100);
        DungeonEngine engine = new DungeonEngine();

        engine.runEncounter(hero, boss);
    }
}