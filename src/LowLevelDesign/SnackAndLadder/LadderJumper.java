package LowLevelDesign.SnackAndLadder;

import java.util.HashMap;

public class LadderJumper {
    HashMap<Integer,Integer> config;

    LadderJumper() {
        config = new HashMap<>();

        config.put(2, 21);
        config.put(4, 7);
        config.put(10, 25);
        config.put(19, 28);
        config.put(66, 0);
        config.put(60, 8);
        config.put(62, 3);
        config.put(68, 6);
    }
}
