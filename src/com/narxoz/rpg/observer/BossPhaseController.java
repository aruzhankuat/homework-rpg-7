package com.narxoz.rpg.observer;

import com.narxoz.rpg.combatant.DungeonBoss;
import com.narxoz.rpg.strategy.BerserkStrategy;

public class BossPhaseController implements GameObserver {
    private final DungeonBoss boss;

    public BossPhaseController(DungeonBoss boss) {
        this.boss = boss;
    }

    @Override
    public void onEvent(GameEvent event) {
        if (event.getType() == GameEventType.BOSS_DAMAGED) {
            if (event.getValue() < 50) {
                System.out.println("SYSTEM: Boss is below 50 HP! Activating Berserk!");
                boss.setStrategy(new BerserkStrategy());
            }
        }
    }
}