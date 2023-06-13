package mages;

import Main.Enemies.Enemy;
import Main.Enemies.Troll;
import Main.Objects.Dragon;
import Main.Objects.Fireball;
import Main.Objects.Lightning;
import Main.Objects.Ogre;
import Main.Players.Warlock;
import org.junit.Before;

public class WarlockTest {

    Fireball fireball;
    Lightning bolt;
    Warlock warlock;
    Troll troll;
    Dragon dragon;
    Ogre ogre;

    @Before
    public void before(){
        dragon = new Dragon();
        ogre = new Ogre();
        fireball = new Fireball();
        bolt = new Lightning();
        troll = new Troll("Badboy",200);
        warlock = new Warlock("Sauron",50, fireball, dragon);
    }

}
