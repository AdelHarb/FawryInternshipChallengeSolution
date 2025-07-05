import Models.src.*;



public class Main {
    public static void main(String[] args) {

        ShippableProduct cheese = new ShippableProduct("Cheese", 6, 10, true, false, 2);
        ShippableProduct tv = new ShippableProduct("TV", 500, 2, false, false, 2);
        NonShippableProduct scratchCart = new NonShippableProduct("Scratch Card", 1, 100, false, false);
        ShippableProduct Biscuits = new ShippableProduct("Biscuits", 3, 50, true, false, 1);

        Customer customer = new Customer(1000, new Cart());
        customer.addToCart(cheese, 2);
        customer.addToCart(tv, 3);
        customer.addToCart(scratchCart, 1);
        customer.addToCart(Biscuits, 5);

        customer.checkout();

    }


}