package LowLevelDesign.Instagram;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.UUID;

public class Followers {
    UUID id;
    String followerId;
    String followingId;
    LocalDateTime createdAt;

    void followUser(String followerId, String followingId) {

    }

    ArrayList<String> getListOfFollowers(String followerId) {
        return new ArrayList<>();
    }
}
