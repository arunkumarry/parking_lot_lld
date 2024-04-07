package slots;

import vehicles.Vehicle;

public abstract class Slot {
    private int slotNumber;


    public Slot(int slotNumber){
        this.slotNumber = slotNumber;
    }

    public abstract String getId();
    public abstract boolean canFit(Vehicle vehicle);

    public int getSlotNumber(){
        return slotNumber;
    }
}
