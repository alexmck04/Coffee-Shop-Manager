//Inherits from the products class
public class Tea extends Product {
    //Constructor to create tea with a name and price, it is simpler than the other products
    public Tea(String name, double price) {
        super(name, price);
    }

    //override the default toString method
    @Override
    public String toString() {
        return super.toString() + " [Tea]";
    }
}
