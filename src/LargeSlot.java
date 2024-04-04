public class LargeSlot extends Slot{
    public LargeSlot(int slotNumber){
        super(slotNumber);
    }

    @Override
    public String getId(){
        return "L_" + this.getSlotNumber();
    }
    @Override
    public boolean canFit(Vehicle vehicle){
        return vehicle instanceof Hatchback || vehicle instanceof Suv;
    }
}
