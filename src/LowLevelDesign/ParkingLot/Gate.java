package LowLevelDesign.ParkingLot;

import java.time.LocalDateTime;

public class Gate {
    int id;
    ParkingAttendant parkingAttendant;
}

class Entrance extends Gate {

    Ticket generateTicket(Vehicle vehicle, int gateId, LocalDateTime entryTime, LocalDateTime exitTime,
                          ParkingAttendant parkingAttendant,TicketStatus ticketStatus) {
        return new Ticket();
    }

    void addVehicleToAvailableSpace(Vehicle vehicle) {

    }
}

class Exit extends Gate {
    void removeVehicleFromAvailableSpace(Ticket ticket) {

    }
    void changeTicketStatus(Ticket ticket) {

    }
    int getParkingAmountToPay(Ticket ticket) {
        return (int)(Math.random());
    }
}