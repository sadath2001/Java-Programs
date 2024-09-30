package creational_dp.protoype_pattern;

import java.util.HashMap;
import java.util.Map;

public class VehicleRegistry {
    // we want the client o only get the classes from this vehicle registry
    private static Map<String,Vehicle> registry=new HashMap<>();
    static{
        registry.put("TWO",new TwoWheeler("Seltos", "Turbo", 1250000, false));
        registry.put("FOUR",new FourWheeler("Seltos", "Turbo", 1250000,false,false));
    }

    public Vehicle getVehicle(String vehicle) throws CloneNotSupportedException{
        return registry.get(vehicle).clone();
    }
}
