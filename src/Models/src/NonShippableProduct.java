package Models.src;

public class NonShippableProduct extends Product {

    public NonShippableProduct(String name, int price, int availableQuantity, boolean isExpirable, boolean isExpired) {
        super(name, price, availableQuantity, isExpirable, isExpired);
    }
    @Override
    public boolean isShippable() {
        return false;
    }
}
