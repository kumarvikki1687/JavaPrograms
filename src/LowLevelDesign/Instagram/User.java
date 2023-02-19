package LowLevelDesign.Instagram;

import java.util.ArrayList;
import java.util.UUID;
import java.time.LocalDateTime;

public class User {
    UUID id;
    String name;
    String mobileNumber;
    String email;
    LocalDateTime createdAt;

    void createUser(String name, String mobileNumber, String email) {

    }

    void updateUser(UUID id, Object... updateObj) {

    }

    User getUser(UUID id) {
        return new User();
    }

    ArrayList<User> getUserByParams(Object... searchParams) {
        return new ArrayList<>();
    }

    void deleteUser(UUID id) {

    }
}
