//Inherits from the product class
public class Coffee extends Product {
    //Strength of the coffee (1 is mild, 5 is very strong)
    private int strength;

    //Constructor to create a coffee with a name, price and strength
    public Coffee(String name, double price, int strength) {
        super(name, price);
        this.strength = strength;
    }

    //getter and setter for the coffee strength
    public int getStrength() { return strength; }
    public void setStrength(int strength) { this.strength = strength; }

    //override the default toString method
    @Override
    public String toString() {
        return super.toString() + " [Strength: " + strength + "]";
    }
}
