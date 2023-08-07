package items.weapons;

import items.Equipables;
import player.StarterItems;

public class Sword_00 extends Equipables{

    public Sword_00() {
        super(0, "Basic Sword", 50, 10);
        super.slashDamage = 1;
        super.critChance = 0.01;
    }

}
