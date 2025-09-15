//Author: Alex McKeever
//Student number: R00232104
//Purpose: Assignment 3 repeat

import java.util.ArrayList;
import java.util.Scanner;

public class MyMain {
    //Store all customers, products and orders in ArrayLists
    private static ArrayList<Customer> customers = new ArrayList<>();
    private static ArrayList<Product> products = new ArrayList<>();
    private static ArrayList<Order> orders = new ArrayList<>();
    
    //Scanner for reading user input
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        boolean running = true; //loop to keep the menu running
        
        //Main loop that will show until the user exits
        while (running) {
            System.out.println("\n--- Coffee Shop Menu ---");
            System.out.println("1. Add customer");
            System.out.println("2. Add product");
            System.out.println("3. Place order");
            System.out.println("4. View customers");
            System.out.println("5. View products");
            System.out.println("6. View orders");
            System.out.println("7. Remove product");
            System.out.println("8. Edit product");
            System.out.println("9. Remove customer");
            System.out.println("10. Edit customer");
            System.out.println("11. Exit");
            System.out.print("Choose an option: ");

            //Read user input
            int choice = Integer.parseInt(sc.nextLine());

            //Switch statement to carry out the option chosen by the user
            switch (choice) {
                case 1 -> addCustomer();
                case 2 -> addProduct();
                case 3 -> placeOrder();
                case 4 -> viewCustomers();
                case 5 -> viewProducts();
                case 6 -> viewOrders();
                case 7 -> removeProduct();
                case 8 -> editProduct();
                case 9 -> removeCustomer();
                case 10 -> editCustomer();
                case 11 -> {
                    System.out.println("Thanks for visiting the coffee shop, have a great day!");
                    running = false; //End the loop
                }
                default -> System.out.println("Invalid choice.");
            }
        }
    }

    //Method to add a new customer
    private static void addCustomer() {
        System.out.print("Enter customer name: ");
        String name = sc.nextLine();

        // Email validator
        String email;
        while (true) {
            System.out.print("Enter customer email: ");
            email = sc.nextLine();
            if (email.contains("@")) {
                break;
            } else {
                System.out.println("Invalid email. Email must include @ symbol.");
            }
        }

        //Create and add a new customer object to the list
        customers.add(new Customer(name, email));
        System.out.println("Customer added.");
    }

    //Method to add a new product
    private static void addProduct() {
        System.out.print("Enter product type (coffee/tea/snack): ");
        String type = sc.nextLine().toLowerCase();
        System.out.print("Enter product name: ");
        String name = sc.nextLine();
        System.out.print("Enter price: ");
        double price = Double.parseDouble(sc.nextLine());

        //Create a product based on type
        switch (type) {
            case "coffee" -> {
                System.out.print("Enter coffee strength (1-5): ");
                int strength = Integer.parseInt(sc.nextLine());
                products.add(new Coffee(name, price, strength));//Add a coffee object
            }
            case "tea" -> products.add(new Tea(name,price));//Add a tea object
            case "snack" -> {
                System.out.print("Enter snack type (Cookie/Cake/Croissant): ");
                String size = sc.nextLine();
                products.add(new Snack(name, price, size));//Add a snack object
            }
            default -> System.out.println("Invalid type, product not added.");
        }
    }

    //Method to place a new order
    private static void placeOrder() {
        //Check if there is at least one customer and one product
        if (customers.isEmpty() || products.isEmpty()) {
            System.out.println("Need at least 1 customer and 1 product.");
            return;
        }

        // Select customer for the order
        System.out.println("Select customer index: ");
        for (int i = 0; i < customers.size(); i++) {
            System.out.println(i + ": " + customers.get(i));
        }
        int custIndex = Integer.parseInt(sc.nextLine());
        Order order = new Order(customers.get(custIndex));

        // Select product for the order
        String more = "y";
        while (more.equalsIgnoreCase("y")) {
            System.out.println("Select product index: ");
            for (int i = 0; i < products.size(); i++) {
                System.out.println(i + ": " + products.get(i));
            }
            int prodIndex = Integer.parseInt(sc.nextLine());
            order.addProduct(products.get(prodIndex));

            System.out.print("Add more? (y/n): ");
            more = sc.nextLine();
        }

        //Add order to list of orders
        orders.add(order);

        // Calculate total price of the order
        double total = 0;
        for (Product p : order.getProducts()) {
            total += p.getPrice();
        }

        System.out.println("Order placed. Your total will be €" + total);
    }

    //Display all customers
    private static void viewCustomers() {
        System.out.println("--- Customers ---");
        for (int i = 0; i < customers.size(); i++) {
            System.out.println(i + ": " + customers.get(i));
        }
    }

    //Display all products
    private static void viewProducts() {
        System.out.println("--- Products ---");
        for (int i = 0; i < products.size(); i++) {
            System.out.println(i + ": " + products.get(i));
        }
    }

    //Display all orders
    private static void viewOrders() {
        orders.forEach(System.out::println);
    }

    //Remove a product by index
    private static void removeProduct() {
        viewProducts(); //Show product list before removing
        System.out.print("Enter product index to remove: ");
        int index = Integer.parseInt(sc.nextLine());
        if (index >= 0 && index < products.size()) {
            products.remove(index);
            System.out.println("Product removed.");
        } else {
            System.out.println("Invalid index.");
        }
    }

    //Edit an existing product
    private static void editProduct() {
        viewProducts();
        System.out.print("Enter product index to edit: ");
        int index = Integer.parseInt(sc.nextLine());
        if (index >= 0 && index < products.size()) {
            System.out.print("Enter new name: ");
            String name = sc.nextLine();
            System.out.print("Enter new price: ");
            double price = Double.parseDouble(sc.nextLine());
            products.get(index).setName(name);//Update name
            products.get(index).setPrice(price);//Update price
            System.out.println("Product updated.");
        } else {
            System.out.println("Invalid index.");
        }
    }

    //Remove a customer by index
    private static void removeCustomer() {
        viewCustomers();
        System.out.print("Enter customer index to remove: ");
        int index = Integer.parseInt(sc.nextLine());
        if (index >= 0 && index < customers.size()) {
            customers.remove(index);
            System.out.println("Customer removed.");
        } else {
            System.out.println("Invalid index.");
        }
    }

    //Edit an existing customer
    private static void editCustomer() {
        viewCustomers();
        System.out.print("Enter customer index to edit: ");
        int index = Integer.parseInt(sc.nextLine());
        if (index >= 0 && index < customers.size()) {
            System.out.print("Enter new name: ");
            String name = sc.nextLine();
            System.out.print("Enter new email: ");
            String email = sc.nextLine();
            customers.get(index).setName(name);//update name
            customers.get(index).setEmail(email);//update email
            System.out.println("Customer updated.");
        } else {
            System.out.println("Invalid index.");
        }
    }
}
