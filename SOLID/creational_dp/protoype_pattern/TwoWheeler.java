package creational_dp.protoype_pattern;

public class TwoWheeler extends Vehicle{
    boolean isElectric;
    public TwoWheeler(String model, String engines, long price,boolean isElectric)
    {
        super( model,  engines, price);
        this.isElectric=isElectric;
    }

}
