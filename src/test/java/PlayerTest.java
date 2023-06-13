import Main.Objects.Axe;
import Main.Objects.Club;
import Main.Objects.Sword;
import Main.Player;
import Main.Enemies.Orc;
import Main.Players.Barbarian;
import Main.Players.Dwarf;
import Main.Players.Knight;
import Main.Players.Mage;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlayerTest {

    Player player;
    Barbarian barbarian;
    Knight knight;
    Dwarf dwarf;
    Orc orc;
    Club club;
    Sword sword;
    Axe axe;

    @Before
    public void before(){
        club = new Club();
        sword = new Sword();
        axe = new Axe();
        barbarian = new Barbarian("Conan", 100, club);
        knight = new Knight("Sir Lost The Plot",120,sword);
        dwarf = new Dwarf("Shorty",200,axe);
        orc = new Orc("Growly", 100);
    }

    @Test
    public void doesClubWork(){
        barbarian.attack(orc);
        assertEquals(95, orc.getHealth());
    }

    @Test
    public void doesSwordWork(){
        knight.attack(orc);
        assertEquals(90, orc.getHealth());
    }

    @Test
    public void doesAxeWork(){
        dwarf.attack(orc);
        assertEquals(80, orc.getHealth());
    }

}
