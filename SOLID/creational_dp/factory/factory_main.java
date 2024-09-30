package creational_dp.factory;

public class factory_main {

    public abstract_factory get_factory(String name)
    {
    
        switch(name){
            case "fuel":return new fuel_car(); 
            case "ev": return new ev_car();
            default:return null;
        }
       
    }
    
}
