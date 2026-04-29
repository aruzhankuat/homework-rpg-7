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








//jhjvjh









LIBRARY ieee;
USE ieee.std_logic_1164.ALL;

ENTITY range_check IS
PORT (
                num : IN  std_logic_vector(2 DOWNTO 0);
x   : OUT std_logic
    );
END range_check;

ARCHITECTURE arch OF range_check IS
        BEGIN

WITH num SELECT
x <= '1' WHEN "010", -- 2
        '1' WHEN "011", -- 3
        '1' WHEN "100", -- 4
        '1' WHEN "101", -- 5
        '1' WHEN "110", -- 6
        '0' WHEN OTHERS;
END arch;




LIBRARY ieee;
USE ieee.std_logic_1164.ALL;

ENTITY decoder_4to16 IS
PORT (
                sel : IN  std_logic_vector(3 DOWNTO 0);
y   : OUT std_logic_vector(15 DOWNTO 0)
    );
END decoder_4to16;

ARCHITECTURE flow OF decoder_4to16 IS
        BEGIN
WITH sel SELECT
y <= "0000000000000001" WHEN "0000",
        "0000000000000010" WHEN "0001",
        "0000000000000100" WHEN "0010",
        "0000000000001000" WHEN "0011",
        "0000000000010000" WHEN "0100",
        "0000000000100000" WHEN "0101",
        "0000000001000000" WHEN "0110",
        "0000000010000000" WHEN "0111",
        "0000000100000000" WHEN "1000",
        "0000001000000000" WHEN "1001",
        "0000010000000000" WHEN "1010",
        "0000100000000000" WHEN "1011",
        "0001000000000000" WHEN "1100",
        "0010000000000000" WHEN "1101",
        "0100000000000000" WHEN "1110",
        "1000000000000000" WHEN "1111",
        "0000000000000000" WHEN OTHERS;
END flow;






LIBRARY ieee;
USE ieee.std_logic_1164.ALL;

ENTITY encoder_16_4 IS
PORT (

                        din  : IN  std_logic_vector(15 DOWNTO 0);

dout : OUT std_logic_vector(3 DOWNTO 0)
    );
END encoder_16_4;

ARCHITECTURE behavior OF encoder_16_4 IS
        BEGIN

dout <= "1111" WHEN din(15) = '1' ELSE
            "1110" WHEN din(14) = '1' ELSE
            "1101" WHEN din(13) = '1' ELSE
            "1100" WHEN din(12) = '1' ELSE
            "1011" WHEN din(11) = '1' ELSE
            "1010" WHEN din(10) = '1' ELSE
            "1001" WHEN din(9) = '1' ELSE
            "1000" WHEN din(8) = '1' ELSE
            "0111" WHEN din(7) = '1' ELSE
            "0110" WHEN din(6) = '1' ELSE
            "0101" WHEN din(5) = '1' ELSE
            "0100" WHEN din(4) = '1' ELSE
            "0011" WHEN din(3) = '1' ELSE
            "0010" WHEN din(2) = '1' ELSE
            "0001" WHEN din(1) = '1' ELSE
            "0000";
END behavior;