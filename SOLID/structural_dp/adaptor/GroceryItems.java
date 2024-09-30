package structural_dp.adaptor;

public class GroceryItems  implements Grocery {
    private String item;
    private String cost;
    private String store;

    public GroceryItems(String item, String cost, String store) {
        this.item = item;
        this.cost = cost;
        this.store = store;
    }

    @Override
    public String getGrocery() {
        return item;
    }

    @Override
    public String getCost() {
        return cost;
    }

    @Override
    public String getStore() {
        return store;
    }
    
}
