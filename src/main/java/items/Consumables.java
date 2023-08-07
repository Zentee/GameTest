package items;

public class Consumables extends Item{

    int recovery;

    int repairPowder;

    int damage;


    public Consumables(int id, String name, int durability, int goldValue) {
        super(id, name, durability, goldValue);
    }


}
