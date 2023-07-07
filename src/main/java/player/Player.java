package player;

public class Player {

    private String name;
    private int hp;
    private int damageOutput;

    private int lv;



    public Player(String name, int hp, int damageOutput, int lv) {
        this.name = name;
        this.hp = hp;
        this.damageOutput = damageOutput;
        this.lv = lv;
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

    public void setDamageOutput(int damageOutput) {
        this.damageOutput = damageOutput;
    }

    public int getLv() {
        return lv;
    }

    public void setLv(int lv) {
        this.lv = lv;
    }
}
