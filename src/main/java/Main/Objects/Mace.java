package Main.Objects;

import Main.Behaviours.IAttack;
import Main.Player;

public class Mace implements IAttack {


    public void attack(Player player)
    {
        player.takeDamage(20);
    }
}
