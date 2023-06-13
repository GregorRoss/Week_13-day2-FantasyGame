package Main.Players;

import Main.Objects.Sword;
import Main.Player;


public class Knight extends Fighter{
    private Sword sword;
    public Knight(String name, int health, Sword sword) {

        super(name, health);
        this.sword = sword;
    }
    public void attack(Player player){
        this.sword.attack(player);
    }

}
