package Models.src;

import java.util.ArrayList;
import java.util.List;

public class Cart {


    private List<CartItem> items;

    public Cart(){

        this.items = new ArrayList<>();
    }


    public List<CartItem> getItems() {
        return items;
    }

    public void addItem(Product product, int quantity) {
        if (product.getExpiry())
        {
            throw new IllegalArgumentException("Cannot add expired product: " + product.getName());
        }
        if (product.getAvailableQuantity() <= 0) {
            throw new IllegalArgumentException("Product " + product.getName() + " is out of stock");
        }
        if (product == null) {
            throw new NullPointerException("Product cannot be null");
        }
        if (product.getName() == null || product.getName().isEmpty()) {
            throw new IllegalArgumentException("Product name cannot be null or empty");
        }
        if (quantity <= 0) {
            throw new IllegalArgumentException("Item quantity must be greater than zero");
        }

        CartItem item = new CartItem(product, quantity);

        items.add(item);
    }
}
