package items;

public abstract class Item {

    protected final int id;
    protected final String name;
    protected int durability;
    protected int goldValue;

    public Item(int id, String name, int durability, int goldValue) {
        this.id = id;
        this.name = name;
        this.durability = durability;
        this.goldValue = goldValue;
    }

    public int getId() {
        return id;
    }



    public String getName() {
        return name;
    }

    public int getDurability() {
        return durability;
    }

    public void setDurability(int durability) {
        this.durability = durability;
    }

    public int getGoldValue() {
        return goldValue;
    }

    public void setGoldValue(int goldValue) {
        this.goldValue = goldValue;
    }
}
