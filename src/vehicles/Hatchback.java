package vehicles;

public class Hatchback extends vehicles.Vehicle{
    public static final String HATCHBACK_PREFIX = "H_";
    public Hatchback(String plate){
        super(plate);
    }
    @Override
    public String getId() {
        return HATCHBACK_PREFIX + this.getPlate();
    }
}
