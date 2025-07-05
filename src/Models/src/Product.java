package Models.src;


public abstract class Product {

    private String name;
    private int price;
    private int availableQuantity;
    private boolean isExpirable;
    private boolean isExpired;

    public Product(String name, int price, int availableQuantity, boolean isExpirable, boolean isExpired) {
        this.name = name;
        this.price = price;
        this.availableQuantity = availableQuantity;
        this.isExpirable = isExpirable;
        this.setExpiry(isExpired);

    }

    public String getName() {
        return name;
    }

    public void setName() {
        this.name = name;
    }
    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public int getAvailableQuantity() {
        return availableQuantity;
    }

    public void setAvailableQuantity(int availableQuantity) {
        this.availableQuantity = availableQuantity;
    }
    public void setExpirability(boolean isExpirable) {
        this.isExpirable = isExpirable;
    }
    public void setExpiry(boolean isExpired) {
        if(getExpiry())
            this.isExpired = isExpired;
    }
    public boolean isExpirable() {
        return isExpirable;
    }
    public boolean getExpiry() {
        if(isExpirable) {;
            return isExpired;
        } else {
            return false;
        }
    }

    public abstract boolean isShippable();
}