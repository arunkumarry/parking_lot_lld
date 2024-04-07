package slots;

import vehicles.*;

public class SmallSlot extends Slot{
    public static final String SMALL_SLOT_PREFIX = "S_";
    public SmallSlot(int slotNumber){
        super(slotNumber);
    }
    @Override
    public String getId(){
        return SMALL_SLOT_PREFIX + this.getSlotNumber();
    }

    @Override
    public boolean canFit(Vehicle vehicle){
        return vehicle instanceof Hatchback;
    }
}
