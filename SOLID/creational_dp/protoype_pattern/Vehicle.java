package creational_dp.protoype_pattern;

public abstract class Vehicle implements Cloneable{
    

    private String model, engines;
    private long price;
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getEngines() {
        return engines;
    }

    public void setEngines(String engines) {
        this.engines = engines;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public Vehicle(String model, String engines, long price) {
        this.model = model;
        this.engines = engines;
        this.price = price;
    }

    protected Vehicle clone() throws CloneNotSupportedException{
        return (Vehicle)super.clone();
    }

    
}
