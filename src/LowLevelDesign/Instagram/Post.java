package LowLevelDesign.Instagram;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.UUID;

public class Post {
    UUID id;
    String userId;
    String text;
    String postUrl;
    LocalDateTime createAt;

    void createPost(String userId, String text, String postUrl) {

    }

    void updatePost(UUID id, Object... updateObj) {

    }

    Post getPostById(UUID id) {
        return new Post();
    }

    ArrayList<Post> getUserFeed(String followingId) {
        return new ArrayList<>();
    }
}
