package LowLevelDesign.SnackAndLadder;

import java.util.HashMap;

public class SnakeJumper {
    HashMap<Integer,Integer> config;

    SnakeJumper() {
        config = new HashMap<>();

        config.put(26, 0);
        config.put(20, 8);
        config.put(16, 3);
        config.put(18, 6);
        config.put(56, 25);
        config.put(50, 38);
        config.put(46, 33);
        config.put(48, 36);
        config.put(99, 46);     // required, otherwise player can't reach 100 forever
                                // if curr position is 99 and no. of dice is 2
    }
}
