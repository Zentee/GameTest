package gamelogic;

import player.Player;

public class Game {

    Player Player1 = new Player("Claudio",  1);
    Player Player2 = new Player("Filipe",  1);


    int player1Hp = Player1.getHp();
    int player2Hp = Player2.getHp();





    public Game() {
    }

    public void fight() {

        boolean whoStarts = Math.random() >= 0.5;

        while (player1Hp > 0 && player2Hp > 0) {

            if (whoStarts) {
                player1Hp -= Math.ceil(Math.random() * Player1.getDamageOutput());
                if (player1Hp < 0) {
                    player1Hp = 0;
                }
                whoStarts = false;
            } else {
                player2Hp -= Math.ceil(Math.random() * Player2.getDamageOutput());
                if (player2Hp < 0) {
                    player2Hp = 0;
                }
                whoStarts = true;
            }
        }

        if (player1Hp < player2Hp) {
            System.out.println("Player1 Wins");
            System.out.println("Player1 hp : " + player1Hp);
            System.out.println("Player2 hp : " + player2Hp);
            Player1.setLv(Player1.getLv() + 1);

        } else if (player1Hp > player2Hp) {
            System.out.println("Player2 Wins");
            System.out.println("Player1 hp : " + player1Hp);
            System.out.println("Player2 hp : " + player2Hp);
            Player2.setLv(Player2.getLv() + 1);
        } else {
            System.out.println("It's a draw");
        }
    }


}
