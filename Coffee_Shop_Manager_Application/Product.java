//Note - I thought of making product abstract but i only sell either tea, coffee or snacks so in this instance it wouldnt work
public class Product {
    //private fields for encapsulation
    private String name;
    private double price;

    //Constructor
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    //Getters and setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    @Override
    public String toString() {
        return name + " (€" + price + ")";
    }
    
    //Constant name for the coffee shop that cant be changed after initialisation
    private final String storeName = "Alex's Coffee Shop";
}
