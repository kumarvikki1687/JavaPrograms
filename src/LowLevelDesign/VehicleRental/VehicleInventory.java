package LowLevelDesign.VehicleRental;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class VehicleInventory {

    Map<VehicleType, ArrayList<Vehicle>> availableVehicleByType;
    Map<VehicleType, ArrayList<Vehicle>> rentedVehicleByType;

    VehicleInventory() {
        availableVehicleByType = new HashMap<>();
        rentedVehicleByType = new HashMap<>();
    }

    void addVehicleToInventory(Vehicle vehicle) {
        if(vehicle.vehicleType == VehicleType.CAR) {
            ArrayList<Vehicle> availableCarVehicle = availableVehicleByType.get(VehicleType.CAR);
            if(availableCarVehicle == null) {
                availableCarVehicle =  new ArrayList<>();
            }
            availableCarVehicle.add(vehicle);
            availableVehicleByType.put(VehicleType.CAR, availableCarVehicle);

        } else if(vehicle.vehicleType == VehicleType.JEEP) {
            ArrayList<Vehicle> availableJeepVehicle = availableVehicleByType.get(VehicleType.JEEP);
            if(availableJeepVehicle == null) {
                availableJeepVehicle =  new ArrayList<>();
            }
            availableJeepVehicle.add(vehicle);
            availableVehicleByType.put(VehicleType.JEEP, availableJeepVehicle);
        }
    }

    void getAvailableVehiclesByType(VehicleType vehicleType) {
        System.out.println("Available " + vehicleType + " vehicles: ");
        ArrayList<Vehicle> availableVehicles = availableVehicleByType.get(vehicleType);

        if(availableVehicles == null || availableVehicles.size() == 0) {
            System.out.println("    No available vehicle for type: " + vehicleType);
            return;
        }
        for(Vehicle vehicle : availableVehicles) {
            System.out.println("    ID: " + vehicle.id + ", Name: " + vehicle.name +  ", Number: " +
                    vehicle.number + ", Type: " + vehicle.vehicleType);
        }
        System.out.println();
    }

    void getRentedVehiclesByType(VehicleType vehicleType) {
        System.out.println("Rented " + vehicleType + " vehicles: ");
        ArrayList<Vehicle> rentedVehicles = rentedVehicleByType.get(vehicleType);
        if(rentedVehicles == null || rentedVehicles.size() == 0) {
            System.out.println("    No rented vehicle for type: " + vehicleType);
            System.out.println();
            return;
        }
        for(Vehicle vehicle : rentedVehicles) {
            System.out.println("    ID: " + vehicle.id + ", Name: " + vehicle.name +  ", Number: " +
                    vehicle.number + ", Type: " + vehicle.vehicleType);
        }
        System.out.println();
    }

    void handleEventVehicleRented(Vehicle vehicle) {
        if (vehicle.vehicleType == VehicleType.CAR) {
            ArrayList<Vehicle> availableCarVehicle = availableVehicleByType.get(VehicleType.CAR);
            availableCarVehicle.remove(vehicle);

            ArrayList<Vehicle> rentedVehicle = rentedVehicleByType.get(VehicleType.CAR);
            if(rentedVehicle == null) {
                rentedVehicle =  new ArrayList<>();
            }
            rentedVehicle.add(vehicle);
            rentedVehicleByType.put(VehicleType.CAR, rentedVehicle);
        }
    }

    void handleEventVehicleReturned(Vehicle vehicle) {
        if (vehicle.vehicleType == VehicleType.CAR) {
            ArrayList<Vehicle> rentedVehicle = rentedVehicleByType.get(VehicleType.CAR);
            rentedVehicle.remove(vehicle);

            ArrayList<Vehicle> availableCarVehicle = availableVehicleByType.get(VehicleType.CAR);
            availableCarVehicle.add(vehicle);
            availableVehicleByType.put(VehicleType.CAR, rentedVehicle);
        }
    }
}
