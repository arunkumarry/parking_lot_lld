public class SmallSlot extends Slot{
    public SmallSlot(int slotNumber){
        super(slotNumber);
    }
    @Override
    public String getId(){
        return "S_" + this.getSlotNumber();
    }

    @Override
    public boolean canFit(Vehicle vehicle){
        return vehicle instanceof Hatchback;
    }
}
