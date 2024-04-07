import vehicles.Vehicle;
import slots.*;
import java.util.HashMap;
import java.util.Map;

public class ParkingManager {
    ParkingLot parkingLot;
    private static Map<String, Vehicle> vehicleMap = new HashMap<>();

    public ParkingManager(int smallSlots, int mediumSlots, int largeSlots){
        this.parkingLot = new ParkingLot(smallSlots, mediumSlots, largeSlots);
    }

    public void newCarEntry(Vehicle vehicle){
        Slot slot = this.assignSlotToVehicle(vehicle);
        if(slot == null) return;
        parkingLot.addCarToSlot(slot, vehicle);
        vehicleMap.put(vehicle.getPlate(), vehicle);
        System.out.println("Your car - " + vehicle.getPlate() + " is parked in slot - "+slot.getId());
    }

    public void carExit(String plate){
        Vehicle vehicle = getVehicle(plate);
        if(vehicle == null){
            System.out.println("Vehicle not present");
            return;
        }
        boolean isVehiclePresent = parkingLot.checkVehicle(vehicle);
        if(isVehiclePresent) {
            System.out.println("Vehicle - "+vehicle.getPlate()+ " exited!");
            parkingLot.removeCar(vehicle);
        } else {
            System.out.println("Vehicle already exited!");
        }
    }

    public Slot assignSlotToVehicle(Vehicle vehicle){
        Slot slot = parkingLot.getAvailableSlot(vehicle);
        if(slot != null){
            return slot;
        }
        System.out.println("No slots available!");
        return null;
    }

    public void getCurrentStatus(){
        parkingLot.getSlotsStatus();
    }

    public Vehicle getVehicle(String plate) {
        return vehicleMap.get(plate);
    }

    public static class NoAvailableSlotException extends RuntimeException {
        public NoAvailableSlotException(String message) {
            super(message);
        }
    }
}
