package LowLevelDesign.SnackAndLadder;

import java.util.Queue;

public class Board {
    int winningPoint;
    Dice dice;
    Queue<Player> players;
    LadderJumper ladderJumper;
    SnakeJumper snakeJumper;

    Board(int size, Dice dice, Queue<Player> players, LadderJumper ladderJumper, SnakeJumper snakeJumper) {
        this.winningPoint = size;
        this.dice = dice;
        this.players = players;
        this.ladderJumper = ladderJumper;
        this.snakeJumper = snakeJumper;
    }

    void foundWinningCase(Player player) {
        System.out.println(player.name + " won the game");
    }

    void BoundaryExitCase(Player player, int point) {
        System.out.println("Crossing boardSize, Curr Position: " + player.position +
                " point: " + point + ", ignoring it");
        players.add(player);
    }

    void ladderFound(Player player, int point) {
        System.out.println("Ladder found, jumping to: " + ladderJumper.config
                .get(player.position+point));
        player.position = ladderJumper.config.get(player.position+point);
        if(player.position==winningPoint) {
            System.out.println(player.name + " won the game");
        } else {
            players.add(player);
        }
    }

    void snakeFound(Player player, int point) {
        System.out.println("Snake found, going down to: " + snakeJumper.config.
                get(player.position+point));
        player.position = snakeJumper.config.get(player.position+point);
        players.add(player);
    }

    void startGame() {
        while(!players.isEmpty()) {
            Player player = players.poll();
            int point = dice.enRollDice();
            System.out.println(player.name + ": " + point);

            if(player.position + point == winningPoint) {
                foundWinningCase(player);
            } else if(player.position+point > winningPoint) {
                BoundaryExitCase(player, point);
            } else if(ladderJumper.config.get(player.position+point)!=null) {
                ladderFound(player, point);
            } else if(snakeJumper.config.get(player.position+point)!=null) {
                snakeFound(player, point);
            } else {
                player.position = player.position + point;
                players.add(player);
            }
        }
    }
}
