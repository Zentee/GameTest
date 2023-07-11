package monsters.types;

import monsters.Monster;

public class Slime extends Monster {

    final String name = "Slime";


    public Slime(int lv, String type) {
        super(lv, type);

        String lowerCaseType = type.toLowerCase();

        int randomBluntDamage = (int) Math.ceil(Math.random() * 3);
        setBluntDamage(randomBluntDamage);

        switch (lowerCaseType) {
            case "fire", "water", "ice", "wind", "earth", "lightning":
                setHp((int) Math.ceil(Math.random() * 5) * lv);
                break;

            case "dark", "light":
                setHp((int) Math.ceil(Math.random() * 10) * lv);
                break;

        }


    }


}
