package LowLevelDesign.SnackAndLadder;

import java.util.LinkedList;
import java.util.Queue;

public class SnakeAndLadder {
    Dice dice;
    Queue<Player> players;
    LadderJumper ladderJumper;
    SnakeJumper snakeJumper;

    SnakeAndLadder() {
        dice = new Dice(2);
        players = new LinkedList<>();
        ladderJumper = new LadderJumper();
        snakeJumper = new SnakeJumper();
    }

    public static void main(String[] args) {

        SnakeAndLadder ob = new SnakeAndLadder();

        Player p1 = new Player(1, "Vikki");
        Player p2 = new Player(2, "Chandan");
        ob.players.add(p1);
        ob.players.add(p2);

        Board board = new Board(100, ob.dice, ob.players, ob.ladderJumper, ob.snakeJumper);
        board.startGame();
    }
}
