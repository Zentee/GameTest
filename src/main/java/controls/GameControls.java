package controls;

import player.StarterItems;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class GameControls {

    private final Scanner gameInputs;


    public GameControls() {
        this.gameInputs = new Scanner(System.in);
    }


    //Whatever gets Input here get's sent as a string.
    public String getPlayerName() {
        System.out.println("Enter Character name");

        return gameInputs.nextLine();
    }

    //Only accepts numbers
    public String getPlayerWeaponId() {
        StarterItems[] starterItemsArray = StarterItems.values();
        StringBuilder weaponOptions = new StringBuilder();
        for (StarterItems item : starterItemsArray) {
            weaponOptions.append(item.getId()).append(". ").append(item.getName()).append("\n");
        }

        System.out.println("Choose your Weapon:\n" + weaponOptions);

        while (true) {
            if (gameInputs.hasNextInt()) {
                int playerChoice = gameInputs.nextInt();
                switch (playerChoice) {
                    case 0: return StarterItems.SWORD.getName();
                    case 1: return StarterItems.MACE.getName();
                    case 2: return StarterItems.BOW.getName();
                    case 3: return StarterItems.STAFF.getName();
                    case 4: return StarterItems.FISTS.getName();
                    default:
                        System.out.println("That's not a valid option. Please enter a number.");
                        break;
                }
            } else {
                System.out.println("That's not a valid option. Please enter a number.");
                gameInputs.next();  // Discard invalid token
            }
        }
    }
}




