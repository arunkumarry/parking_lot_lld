package vehicles;

public class Suv extends vehicles.Vehicle{
    public static final String SUV_PREFIX = "S_";
    public Suv(String plate){
        super(plate);
    }

    public String getId(){
        return SUV_PREFIX + this.getPlate();
    }
}
