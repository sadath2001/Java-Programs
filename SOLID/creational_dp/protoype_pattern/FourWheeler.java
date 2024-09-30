package creational_dp.protoype_pattern;

public class FourWheeler extends Vehicle {
    private boolean isDiesel,automatic;
    public FourWheeler(String model, String engines, long price, boolean isDiesel, boolean automatic) {
        super(model, engines, price);
        this.isDiesel = isDiesel;
        this.automatic = automatic;
    }
    protected FourWheeler clone() throws CloneNotSupportedException{
        return (FourWheeler)super.clone();
    }
}
