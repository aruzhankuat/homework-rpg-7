package com.narxoz.rpg.engine;

import com.narxoz.rpg.combatant.Hero;
import com.narxoz.rpg.combatant.DungeonBoss;
import com.narxoz.rpg.observer.*;

public class DungeonEngine {
    public void runEncounter(Hero hero, DungeonBoss boss) {
        CombatPublisher publisher = new CombatPublisher();
        BossPhaseController phaseController = new BossPhaseController(boss);
        publisher.subscribe(phaseController);

        System.out.println("--- Battle Started ---");
        while (hero.getHealth() > 0 && boss.getHealth() > 0) {

            int damageToBoss = 15;
            boss.takeDamage(damageToBoss);
            System.out.println("Hero attacks! Boss HP: " + boss.getHealth());

            publisher.notifyObservers(new GameEvent(GameEventType.BOSS_DAMAGED, "Boss took damage", boss.getHealth()));

            int bossDamage = boss.attack(10);
            hero.takeDamage(bossDamage);
            System.out.println("Boss attacks! Hero HP: " + hero.getHealth());
        }
    }
}