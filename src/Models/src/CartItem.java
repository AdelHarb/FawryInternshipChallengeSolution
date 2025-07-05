package Models.src;

public class CartItem {

    private Product product;
    private int quantity;

    public CartItem(Product product , int quantity) {
        this.quantity = quantity;
        this.product = product;
    }

    public Product getProduct() {
        return product;
    }
    public int getQuantity() {
        return quantity;
    }

}
