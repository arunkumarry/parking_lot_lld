package vehicles;

import java.util.HashMap;
import java.util.Map;

public abstract class Vehicle {
    private String plate;

    public Vehicle(String plate){
        this.plate = plate;
    }

    public abstract String getId();

    public String getPlate(){
        return plate;
    }
}
