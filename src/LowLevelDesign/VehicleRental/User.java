package LowLevelDesign.VehicleRental;

import java.util.UUID;

public class User {
    UUID id;
    String name;
    String phoneNumber;
    String email;

    User(String name, String phoneNumber, String email) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }
}
