package Main.Players;

import Main.Enemies.Orc;
import Main.Objects.Axe;
import Main.Player;


public class Dwarf extends Fighter {
    private Axe axe;
    public Dwarf(String name, int health, Axe axe) {

        super(name, health);
        this.axe = axe;
    }


    public void attack(Player player) {
        this.axe.attack(player);
    }
}
