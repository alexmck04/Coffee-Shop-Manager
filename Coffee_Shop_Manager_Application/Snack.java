//Inherits from the product class
public class Snack extends Product {
    private String type; //cookie, cake, pastry etc.

    //Constructor for creating a snack with a name, price and type
    public Snack(String name, double price, String type) {
        super(name, price);
        this.type = type;
    }

    //Getter and setter
    public String getType() { return type; }
    public void setType(String type) { this.type = type; }

    //Override the default toString method
    @Override
    public String toString() {
        return super.toString() + " [Type: " + type + "]";
    }
}
