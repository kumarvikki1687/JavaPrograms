package LowLevelDesign.Instagram;

import java.util.ArrayList;
import java.util.UUID;

public class Like {
    UUID id;
    String userId;
    LikeFor likeFor;    // like for post or comment
    String parentId;    // id of post or comment based on likeFor

    void addLike(String userId, LikeFor likeFor, String parentId) {

    }

    int getNumberOfLikes(LikeFor likeFor, String parentId) {
        return 1;
    }

    ArrayList<User> getUserListForLike(LikeFor likeFor, String parentId) {
        return new ArrayList<>();
    }
}
