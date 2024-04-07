package slots;

import vehicles.*;

public class LargeSlot extends Slot{
    public static final String LARGE_SLOT_PREFIX = "L_";
    public LargeSlot(int slotNumber){
        super(slotNumber);
    }

    @Override
    public String getId(){
        return LARGE_SLOT_PREFIX + this.getSlotNumber();
    }
    @Override
    public boolean canFit(Vehicle vehicle){
        return vehicle instanceof Hatchback || vehicle instanceof Suv;
    }
}
