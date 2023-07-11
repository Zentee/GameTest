package monsters;

public class Monster {

    private String name;

    private String type;
    protected int hp;
    protected int bluntDamage;

    protected int slashDamage;

    protected int magicDamage;
    protected int damageOutput = bluntDamage + slashDamage + magicDamage;
    protected int lv;


    public Monster(int lv, String type) {
        this.lv = lv;
        this.type = type;
    }


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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


}
