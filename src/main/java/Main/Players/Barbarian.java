package Main.Players;

import Main.Behaviours.IAttack;
import Main.Objects.Club;



public class Barbarian extends Fighter{

    private Club club;

    public Barbarian(String name, int health) {
        super(name, health);

    }



    public String attack(){
        return "Enemy attacked with " + club;
    }



}
