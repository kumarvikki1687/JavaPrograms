package LowLevelDesign.ParkingLot;
import java.util.List;

public class parkingLot {

    List<ParkingFloor> parkingFloors;
    List<Entrance> entrances;       // not on floor wise
    List<Exit> exits;               // not on floor wise
    Address address;

    // check at high level
    boolean checkForAvailableSpace(Vehicle vehicle) {
        return true;
    }
    // change parkingAttendant at shift-wise
    void updateParkingAttendant(ParkingAttendant parkingAttendant, int gateId) {

    }
}