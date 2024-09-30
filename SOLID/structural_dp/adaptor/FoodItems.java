package structural_dp.adaptor;

public class FoodItems implements Item {

    private String item;
    private String cost;
    private String store;

    public FoodItems(String item, String cost, String store) {
        this.item = item;
        this.cost = cost;
        this.store = store;
    }

    @Override
    public String getItem() {
        return item;
    }

    @Override
    public String getCost() {
        return cost;
    }

    @Override
    public String getRestaurant() {
        return store;
    }
    
}
