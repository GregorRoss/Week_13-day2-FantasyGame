package Main.Objects;

import Main.Behaviours.IPoison;

public class Poison implements IPoison {


    @Override
    public int poison() {
        return 15;
    }
}
