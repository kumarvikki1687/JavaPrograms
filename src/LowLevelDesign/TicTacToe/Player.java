package LowLevelDesign.TicTacToe;

public class Player {
    int id;
    String name;
    Character playerSymbol;

    Player(int id, String name, Character playerSymbol) {
        this.id = id;
        this.name = name;
        this.playerSymbol = playerSymbol;
    }
}
