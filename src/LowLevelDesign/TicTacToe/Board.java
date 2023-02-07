package LowLevelDesign.TicTacToe;

import java.util.Queue;
import java.util.Scanner;

public class Board {
    int boardSize = 3;
    char arr[][];
    Queue<Player> players;
    Scanner sc;

    Board(Queue<Player> players) {
        this.players = players;
        arr = new char[boardSize][boardSize];
        initialiseBoard();
        displayBoard();
        sc = new Scanner(System.in);
    }

    void startGame() {
        int count = 0;
        while(players.size()==2) {
            Player player = players.poll();
            System.out.print("Provide input for " + player.name + ": ");
            int row = sc.nextInt();
            int col = sc.nextInt();
            while(!checkForValidInput(row, col, player)) {
                row = sc.nextInt();
                col = sc.nextInt();
            }
            arr[row-1][col-1] = player.playerSymbol;
            count++;
            displayBoard();
            if(count>=boardSize+2 && checkForWinningCase(player)) {     // no need to check
                // before 5 steps
                System.out.println(player.name + " won the game");
            } else {
                players.add(player);
            }
            if(count==boardSize*boardSize) {
                System.out.println("Game Tie");
                break;
            }
        }
    }

    void initialiseBoard() {
        for(int i=0;i<boardSize;i++) {
            for(int j=0;j<boardSize;j++) {
                arr[i][j] = ' ';
            }
        }
    }

    void displayBoard() {
        System.out.println("-------------");
        for(int i=0;i<boardSize;i++) {
            System.out.print("| ");
            for(int j=0;j<boardSize;j++) {
                System.out.print(arr[i][j] + " | ");
            }
            System.out.println("\n-------------");
        }
        System.out.println();
    }

    boolean checkForValidInput(int row, int col, Player player) {
        if(row>boardSize || col>boardSize) {
            System.out.print("Crossing board size, Again Provide input for " + player.name + ": ");
            return false;
        } else if(arr[row-1][col-1]!=' ') {
            System.out.print("place already filled, Again Provide input for " + player.name + ": ");
            return false;
        }
        return true;
    }

    boolean checkForWinningCase(Player player) {
        if(arr[0][0]+arr[0][1]+arr[0][2] == player.playerSymbol + player.playerSymbol +
                player.playerSymbol) {
            return true;
        }
        if(arr[1][0]+arr[1][1]+arr[1][2] == player.playerSymbol + player.playerSymbol +
                player.playerSymbol) {
            return true;
        }
        if(arr[2][0]+arr[2][1]+arr[2][2] == player.playerSymbol + player.playerSymbol +
                player.playerSymbol) {
            return true;
        }
        if(arr[0][0]+arr[1][0]+arr[2][0] == player.playerSymbol + player.playerSymbol +
                player.playerSymbol) {
            return true;
        }
        if(arr[0][1]+arr[1][1]+arr[2][1] == player.playerSymbol + player.playerSymbol +
                player.playerSymbol) {
            return true;
        }
        if(arr[0][2]+arr[1][2]+arr[2][2] == player.playerSymbol + player.playerSymbol +
                player.playerSymbol) {
            return true;
        }
        if(arr[0][0]+arr[1][1]+arr[2][2] == player.playerSymbol + player.playerSymbol +
                player.playerSymbol) {
            return true;
        }
        if(arr[0][2]+arr[1][1]+arr[2][0] == player.playerSymbol + player.playerSymbol +
                player.playerSymbol) {
            return true;
        }
        return false;
    }
}
