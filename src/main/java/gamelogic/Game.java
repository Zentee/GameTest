package gamelogic;

import player.Player;

import java.lang.reflect.Method;

public class Game {



    Player Claudio = new Player("Claudio", 10, 1, 1);
    Player Filipe = new Player ("Filipe", 10, 1, 1);

    int claudioHp =  Claudio.getHp();
    int filipeHp = Filipe.getHp();



    public Game() {
    }
    public void fight(){

        boolean whoStarts = Math.random() >= 0.5;

        while (claudioHp > 0 && filipeHp > 0) {

            if (whoStarts) {
                claudioHp -= Math.ceil(Math.random() * 6);
                if(claudioHp < 0){
                 claudioHp = 0;
                }
                whoStarts = false;
            } else {
                filipeHp -= Math.ceil(Math.random() * 6);
                if(filipeHp < 0){
                    filipeHp = 0;
                }
                whoStarts = true;
            }
        }

        if (claudioHp < filipeHp) {
            System.out.println("Filipe Wins");
            System.out.println("Claudio hp : " + claudioHp);
            System.out.println("Filipe hp : " + filipeHp);

        } else if (claudioHp > filipeHp) {
            System.out.println("Claudio Wins");
            System.out.println("Claudio hp : " + claudioHp);
            System.out.println("Filipe hp : " + filipeHp);
        } else {
            System.out.println("It's a draw");
        }
    }


}
