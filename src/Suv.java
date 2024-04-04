public class Suv extends Vehicle{
    public Suv(String plate){
        super(plate);
    }

    public String getId(){
        return "S_" + this.getPlate();
    }
}
