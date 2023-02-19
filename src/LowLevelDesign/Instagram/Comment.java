package LowLevelDesign.Instagram;

import java.time.LocalDateTime;
import java.util.UUID;

public class Comment {
    UUID id;
    String postId;
    String userId;
    String comment;
    LocalDateTime createdAt;

    void addCommentToPost(String postId, String comment) {

    }

    String getCommentForPost(String postId) {
        return new String();
    }
}
