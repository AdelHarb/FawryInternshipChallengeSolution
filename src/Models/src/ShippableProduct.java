package Models.src;


public class ShippableProduct extends Product {

    private int weight;

    public ShippableProduct(String name, int price, int quantity, boolean isExpirable, boolean isExpired, int weight) {
        super(name, price, quantity, isExpirable, isExpired);
        this.weight = weight;
    }
    public int getWeight() {
        return weight;
    }
    @Override
    public boolean isShippable() {
        return true;
    }
}
