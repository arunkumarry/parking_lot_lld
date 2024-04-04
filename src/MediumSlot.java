public class MediumSlot extends Slot{
    public MediumSlot(int slotNumber){
        super(slotNumber);
    }
    @Override
    public String getId(){
        return "M_" + this.getSlotNumber();
    }

    @Override
    public boolean canFit(Vehicle vehicle){
        return vehicle instanceof Hatchback || vehicle instanceof Suv;
    }
}
