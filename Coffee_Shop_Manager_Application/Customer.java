public class Customer {
    //Private fields for encapsulation
    private String name;
    private String email;

    //Constructor to create a new customer object with a name and emaill
    public Customer(String name, String email) {
        this.name = name;
        this.email = email;
    }

    //Getters and setters for the name and email
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    //Override the default toString method
    @Override
    public String toString() {
        return name + " (" + email + ")";
    }
}
