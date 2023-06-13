import Main.Character;
import Main.Enemies.Orc;
import Main.Players.Barbarian;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CharacterTest {

    Character character;
    Barbarian barbarian;
    Orc orc;

    @Before
    public void before(){
        barbarian = new Barbarian("Conan", 100);
        orc = new Orc("Growly", 100);
    }

    @Test
    public void doesClubWork(){
        assertEquals("Enemy attacked with club", barbarian.attack());
    }

}
