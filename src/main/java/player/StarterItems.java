package player;

import items.weapons.Sword_00;

public enum StarterItems {

    SWORD(0, "Basic Sword"),
    MACE(1, "Basic Mace"),
    BOW(2, "Basic Bow"),
    STAFF(3, "Basic Staff"),
    FISTS(4, "Bare hands");

    private final int id;
    private final String name;

    StarterItems(int id, String name){
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
