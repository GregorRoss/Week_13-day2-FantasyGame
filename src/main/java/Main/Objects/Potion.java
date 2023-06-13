package Main.Objects;

import Main.Behaviours.IHeal;

public class Potion implements IHeal {

    public int heal() {
        return 20;
    }
}
