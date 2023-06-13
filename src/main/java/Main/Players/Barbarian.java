package Main.Players;

import Main.Objects.Club;
import Main.Player;


public class Barbarian extends Fighter{

    private Club club;

    public Barbarian(String name, int health, Club club) {
        super(name, health);
        this.club = club;
    }


    public void attack(Player player){
        this.club.attack(player);
    }

}
