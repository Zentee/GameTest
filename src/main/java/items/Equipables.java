package items;

public class Equipables extends Item {

    protected int bluntDamage;

    protected int slashDamage;

    protected int magicDamage;

    protected int projectileDamage;
    protected int strikeDamage;
    protected int defense;

    protected int spirit;

    protected int evasion;

    protected double critChance;

    protected double critDamage;


    public Equipables(int id, String name, int durability, int goldValue) {
        super(id, name, durability, goldValue);

    }

    public int getBluntDamage() {
        return bluntDamage;
    }

    public int getSlashDamage() {
        return slashDamage;
    }

    public int getMagicDamage() {
        return magicDamage;
    }

    public int getProjectileDamage() {
        return projectileDamage;
    }

    public int getStrikeDamage() {
        return strikeDamage;
    }

    public int getDefense() {
        return defense;
    }

    public int getSpirit() {
        return spirit;
    }

    public int getEvasion() {
        return evasion;
    }

    public double getCritChance() {
        return critChance;
    }

    public double getCritDamage() {
        return critDamage;
    }
}
