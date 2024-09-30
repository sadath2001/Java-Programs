package structural_dp.adaptor;

public class Adaptor implements Item{
    Grocery item;
    public String getItem()
    {
        return item.getGrocery();
    }
    public String getCost()
    {
        return item.getCost();
    }
    public String getRestaurant()
    {
        return item.getStore();
    }
    public Adaptor(Grocery item)
    {
        this.item = item;
    }
   
}
