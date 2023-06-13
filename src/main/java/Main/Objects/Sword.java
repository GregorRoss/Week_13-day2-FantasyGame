package Main.Objects;

import Main.Behaviours.IAttack;
import Main.Player;


public class Sword implements IAttack {



    public void attack(Player player)
    {
        player.takeDamage(10);
    }
}
