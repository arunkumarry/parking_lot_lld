package slots;

import vehicles.*;

public class MediumSlot extends Slot{
    public static final String MEDIUM_SLOT_PREFIX = "M_";
    public MediumSlot(int slotNumber){
        super(slotNumber);
    }
    @Override
    public String getId(){
        return MEDIUM_SLOT_PREFIX + this.getSlotNumber();
    }

    @Override
    public boolean canFit(Vehicle vehicle){
        return vehicle instanceof Hatchback || vehicle instanceof Suv;
    }
}
