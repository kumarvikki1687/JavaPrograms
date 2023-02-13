package LowLevelDesign.VehicleRental;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class Reservation {
    UUID id;
    UUID vehicleId;
    VehicleType vehicleType;
    String vehicleName;
    UUID userId;
    String userName;
    LocalDateTime reservationDate;
    LocalDateTime reserveTill;
    LocalDateTime actualReturnDate;
    RentalStatus rentalStatus;

    Map<UUID, Reservation> reservationInfo;

    Reservation() {
        reservationInfo = new HashMap<>();
    }

    void addReservation(VehicleInventory vehicleInventory, Vehicle vehicle, User user, LocalDateTime reservationDate, LocalDateTime reserveTill) {
        Reservation reservation = new Reservation();
        reservation.id = UUID.randomUUID();
        reservation.vehicleId = vehicle.id;
        reservation.vehicleType = vehicle.vehicleType;
        reservation.vehicleName = vehicle.name;
        reservation.userId = user.id;
        reservation.userName = user.name;
        reservation.reservationDate = reservationDate;
        reservation.reserveTill = reserveTill;
        reservation.rentalStatus = RentalStatus.RENTED;

        reservationInfo.put(reservation.id, reservation);
        vehicleInventory.handleEventVehicleRented(vehicle);
    }

    Reservation getReservationById(UUID id) {
        return reservationInfo.get(id);
    }

    void returnVehicle(VehicleInventory vehicleInventory, UUID reservationId, Vehicle vehicle) {
        Reservation reservation = getReservationById(reservationId);
        reservation.actualReturnDate = LocalDateTime.now();
        reservation.rentalStatus = RentalStatus.RETURNED;

        vehicleInventory.handleEventVehicleReturned(vehicle);
    }
}
