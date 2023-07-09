package monsters;

public class Monsters {

    private String name;

    private String type;
    private int hp;
    private int bluntDamage;

    private int slashDamage;

    private int magicDamage;
    private int damageOutput = bluntDamage + slashDamage + magicDamage;
    private int lv;


    public Monsters(String name, int lv, String type, int hp) {
        this.name = name;
        this.lv = lv;
        this.type = type;
        this.hp = hp * lv;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setDamageOutput(int damageOutput) {
        this.damageOutput = damageOutput;
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
