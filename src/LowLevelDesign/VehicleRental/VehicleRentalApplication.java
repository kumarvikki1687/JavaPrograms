package LowLevelDesign.VehicleRental;

import java.time.LocalDateTime;

public class VehicleRentalApplication {

    public static void main(String[] args) {
        VehicleInventory vehicleInventory = new VehicleInventory();
        Reservation reservation = new Reservation();

        Vehicle v1 = new Vehicle("Maruti 800", "JH-01-BF-6308", VehicleType.CAR);
        Vehicle v2 = new Vehicle("THAR 4X4", "HR-05-AC-4321", VehicleType.JEEP);

        vehicleInventory.addVehicleToInventory(v1);
        vehicleInventory.addVehicleToInventory(v2);

        System.out.println();

        vehicleInventory.getAvailableVehiclesByType(VehicleType.CAR);
        vehicleInventory.getAvailableVehiclesByType(VehicleType.JEEP);

        User u1 = new User("Vikki", "1234567890", "v@gmail.com");
        User u2 = new User("Chandu", "0987654321", "c@gmail.com");

        reservation.addReservation(vehicleInventory, v1, u1, LocalDateTime.now(), LocalDateTime.now().plusDays(3));
        vehicleInventory.getRentedVehiclesByType(VehicleType.CAR);

        vehicleInventory.getAvailableVehiclesByType(VehicleType.CAR);
    }
}
