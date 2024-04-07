import java.util.*;
import vehicles.Vehicle;
import slots.*;

public class ParkingLot {
    private int smallSlots;
    private int mediumSlots;
    private int largeSlots;
    private HashMap<Slot, Vehicle> slotsStatus = new LinkedHashMap<>();

    public ParkingLot(int smallSlots, int mediumSlots, int largeSlots){
        this.smallSlots = smallSlots;
        this.mediumSlots = mediumSlots;
        this.largeSlots = largeSlots;
        this.generateSlots();
    }

    private void generateSlots(){
        for(int i = 0; i < smallSlots; i++){
            Slot slot = new SmallSlot(i);
            this.slotsStatus.put(slot, null);
        }
        for(int i = 0; i < mediumSlots; i++){
            Slot slot = new MediumSlot(i);
            this.slotsStatus.put(slot, null);
        }
        for(int i = 0; i < largeSlots; i++){
            Slot slot = new LargeSlot(i);
            this.slotsStatus.put(slot, null);
        }
    }

    public int getSmallSlots(){
        return smallSlots;
    }

    public int getMediumSlots(){
        return mediumSlots;
    }

    public int getLargeSlots(){
        return largeSlots;
    }

    public Slot getAvailableSlot(Vehicle vehicle) {
        //System.out.print(slotsStatus);
        for (Map.Entry<Slot, Vehicle> entry : slotsStatus.entrySet()) {
            if (entry.getValue() == null && entry.getKey().canFit(vehicle)) {
                return entry.getKey();
            }
        }
        return null;
    }

    public void addCarToSlot(Slot slot, Vehicle vehicle){
        this.slotsStatus.put(slot, vehicle);
    }

    public boolean checkVehicle(Vehicle vehicle){
        for(Map.Entry<Slot, Vehicle> entry : slotsStatus.entrySet()) {
            if (entry.getValue() == vehicle) {
                return true;
            }
        }
        return false;
    }

    public void removeCar(Vehicle vehicle){
        for(Map.Entry<Slot, Vehicle> entry : slotsStatus.entrySet()) {
            if (entry.getValue() == vehicle) {
                slotsStatus.put(entry.getKey(), null);
            }
        }
    }

    public void getSlotsStatus(){
        if(slotsStatus.isEmpty()){
            System.out.println("Parking Manager is looking for slots and cars :(");
            return;
        }
        for (Map.Entry<Slot, Vehicle> entry : slotsStatus.entrySet()) {
            if(entry.getValue() != null){
                System.out.print("Car - "+entry.getValue().getPlate()+" is parked in slot - "+entry.getKey().getId()+"\n");
            }
        }
    }
}
