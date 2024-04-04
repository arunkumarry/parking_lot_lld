import java.util.HashMap;
import java.util.Map;

public abstract class Vehicle {
    private String plate;
    private static Map<String, Vehicle> vehicleMap = new HashMap<>();

    public Vehicle(String plate){
        this.plate = plate;
        vehicleMap.put(plate, this);
    }

    public abstract String getId();

    public String getPlate(){
        return plate;
    }

    public static Vehicle getVehicle(String plate) {
        return vehicleMap.get(plate);
    }
}
