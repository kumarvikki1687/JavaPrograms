package LowLevelDesign.TicTacToe;

import java.util.LinkedList;
import java.util.Queue;

public class TicTacToe {

    Queue<Player> players;

    TicTacToe() {
        this.players = new LinkedList<>();
    }

    public static void main(String[] args) {

        TicTacToe ob = new TicTacToe();

        Player p1 = new Player(1, "Vikki", 'X');
        Player p2 = new Player(2, "Chandan", '0');
        ob.players.add(p1);
        ob.players.add(p2);

        Board board = new Board(ob.players);
        board.startGame();
    }
}
