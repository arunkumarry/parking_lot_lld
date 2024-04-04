public class Hatchback extends Vehicle{

    public Hatchback(String plate){
        super(plate);
    }
    @Override
    public String getId() {
        return "H_" + this.getPlate();
    }

//    @Override
//    public Vehicle getVehicle(String plate){
//        for (Vehicle vehicle : vehicles) {
//            // Check if the plate of the current vehicle matches the input plate
//            if (vehicle.getPlate().equals(plate)) {
//                // If a match is found, return the vehicle
//                return vehicle;
//            }
//        }
//    }
}
