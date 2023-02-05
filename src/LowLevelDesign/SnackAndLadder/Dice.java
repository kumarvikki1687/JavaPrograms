package LowLevelDesign.SnackAndLadder;

public class Dice {
    int noOfDice;

    Dice(int noOfDice) {
        this.noOfDice = noOfDice;
    }

    int enRollDice() {
        int min = noOfDice;
        int max = 6*noOfDice;

        return (int)(min + (max-min)*Math.random());
    }
}
