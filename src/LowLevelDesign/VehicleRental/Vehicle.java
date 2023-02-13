package LowLevelDesign.VehicleRental;

import java.util.UUID;

public class Vehicle {
    UUID id;
    String name;
    String number;
    VehicleType vehicleType;

    Vehicle(String name, String number, VehicleType vehicleType) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.number = number;
        this.vehicleType = vehicleType;
    }
}
