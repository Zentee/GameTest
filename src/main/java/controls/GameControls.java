package controls;

import java.util.Scanner;

public class GameControls {

    private final Scanner gameInputs;


    public GameControls() {
        this.gameInputs = new Scanner(System.in);
    }


    public String getPlayerName() {
        System.out.println("Enter Character name");

        return gameInputs.nextLine();
    }

    public String getPlayerWeaponId(){
        System.out.println("Choose your Weapon");
        return Integer.toString(gameInputs.nextInt());
    }



}
