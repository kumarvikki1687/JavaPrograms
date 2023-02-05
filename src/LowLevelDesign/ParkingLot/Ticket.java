package LowLevelDesign.ParkingLot;

import java.time.LocalDateTime;

public class Ticket {
    int id;
    Gate gate;
    LocalDateTime entryTime;
    LocalDateTime exitTime;
    ParkingAttendant parkingAttendant;
    TicketStatus ticketStatus;
    Vehicle vehicle;
}
