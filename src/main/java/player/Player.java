package player;

public class Player {

    private String name;
    private int hp;
    private int bluntDamage = 1;
    private int slashDamage;
    private int magicDamage;
    private int damageOutput = bluntDamage + slashDamage + magicDamage;
    private int lv = 1;

    private String weapon;


    public Player(String name, String weapon) {
        this.name = name;
        this.weapon = weapon;
        hp = 5 * lv;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getDamageOutput() {
        return damageOutput;
    }


    public int getBluntDamage() {
        return bluntDamage;
    }

    public void setBluntDamage(int bluntDamage) {
        this.bluntDamage = bluntDamage;
    }

    public int getSlashDamage() {
        return slashDamage;
    }

    public void setSlashDamage(int slashDamage) {
        this.slashDamage = slashDamage;
    }

    public int getMagicDamage() {
        return magicDamage;
    }

    public void setMagicDamage(int magicDamage) {
        this.magicDamage = magicDamage;
    }

    public int getLv() {
        return lv;
    }

    public void setLv(int lv) {
        this.lv = lv;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }
}
