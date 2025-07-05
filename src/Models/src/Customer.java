package Models.src;

public class Customer {

    private float balance;
    private Cart cart;
    private float totalWeight;
    private int totalPrice;


    public Customer(float balance, Cart cart) {
        this.balance = balance;
        this.cart = cart;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }
    public float getBalance() {
        return balance;
    }
    public Cart getCart() {
        return cart;
    }

    public void addToCart(Product product, int quantity) {
        cart.addItem(product, quantity);
    }

    public void checkout() {
        if (cart.getItems().isEmpty()) {
            System.out.println("Cart is empty.");
            return;
        }

        System.out.println("** Shipment notice **");
        totalPrice = 0;
        totalWeight = 0;

        for (CartItem item : cart.getItems()) {
            Product product = item.getProduct();
            if (product.isShippable()) {
                if (product.getAvailableQuantity() >= item.getQuantity()) {
                    ShippableProduct shippableProduct = (ShippableProduct) product;
                    totalWeight += shippableProduct.getWeight() * item.getQuantity();
                    System.out.println(item.getQuantity() + "X of " + product.getName() + "      " + shippableProduct.getWeight() * item.getQuantity() + "g");
                }
            }
        }
        System.out.println("Total Package Weight: " + totalWeight / 1000.0 + "KG");
        System.out.println("** Checkout receipt **");
        for (CartItem item : cart.getItems()) {
            Product product = item.getProduct();
            if (product.isShippable()) {
                if (product.getAvailableQuantity() >= item.getQuantity()) {
            int price = product.getPrice();
            totalPrice += price * item.getQuantity();
            System.out.println(item.getQuantity() + "X of " + product.getName() + "      " + price * item.getQuantity());
        }
    }
        }
        if (totalPrice <= balance) {
            System.out.println("----------------------");
            System.out.println("Subtotal         " + totalPrice);
            System.out.println("Shipping         30");
            System.out.println("Amount           " + (totalPrice + 30));
        } else {
            System.out.println("Insufficient balance ");
        }
    }


}
