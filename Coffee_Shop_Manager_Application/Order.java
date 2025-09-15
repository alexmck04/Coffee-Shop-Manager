import java.util.ArrayList;

public class Order {
    //Each order is linked to a customer
    private Customer customer;
    //List to hold all the customers products in this order
    private ArrayList<Product> products = new ArrayList<>();

    //Constructor to create an order for a specific customer
    public Order(Customer customer) {
        this.customer = customer;
    }

    //Method to add a product to the order
    public void addProduct(Product product) {
        products.add(product);
    }

    //Getter for the customer
    public Customer getCustomer() {
        return customer;
    }

    //Getter for the products in the order
    public ArrayList<Product> getProducts() {
        return products;
    }

    //override the default toString method
    @Override
    public String toString() {
        return "Order for " + customer.getName() + ": " + products;
    }
}
