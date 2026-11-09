# Coffee Shop Management System

# Overview

A console-based Coffee Shop Management System developed in Java as part of a college assignment.

The application allows users to manage customers, products and orders through a menu-driven interface. It supports different product types, including coffee, tea and snacks, and uses object-oriented programming principles to organise the application.

# Features

- Customer Management: Add, view, edit and remove customers.
- Product Management: Add, view, edit and remove products.
- Multiple Product Types: Supports coffee, tea and snacks, each with its own properties.
- Order Management: Create orders for registered customers and add multiple products to each order.
- Order Totals: Calculate the total price of an order.
- Input Validation: Basic email validation and checks for valid customer and product indexes.

# Technologies Used

- Java
- Object-Oriented Programming (OOP)
- ArrayLists
- Java Collections
- Scanner for user input

# Project Structure

The application is organised into separate Java classes:

 `MyMain.java` - Main entry point of the application. Contains the menu and methods for managing customers, products and orders. 
 `Customer.java` - Represents a customer, storing their name and email address. 
 `Product.java` - Base class for products, containing shared properties such as name and price. 
 `Coffee.java` - Extends Product and includes a coffee strength property. 
 `Tea.java` - Extends Product and represents tea products. 
 `Snack.java` - Extends Product and includes a snack type property. 
 `Order.java` - Represents an order linked to a customer and containing a list of products. 

# Object-Oriented Programming

The project demonstrates several object-oriented programming concepts:

- Encapsulation: Class fields are private and accessed through getter and setter methods.
- Inheritance: Coffee, Tea and Snack inherit common properties and methods from the Product class.
- Polymorphism: Product subclasses override the `toString()` method to provide their own product descriptions.
- Classes and Objects: Customers, products and orders are represented as separate objects, helping organise the application.

# Running the Application

# Requirements

- Java Development Kit (JDK) 14 or later.
- An IDE or code editor capable of running Java applications, such as Visual Studio Code.

# Running in VS Code

1. Clone or download this repository.
2. Open the project folder in Visual Studio Code.
3. Install the Extension Pack for Java if it is not already installed.
4. Open `MyMain.java`.
5. Select Run above the `main()` method.

# Running through the Terminal

Navigate to the directory containing the Java source files and compile the application:

javac *.java

Run the application using:

java MyMain

# Application Menu

The application provides the following options:

1 - Add customer 
2 - Add product 
3 - Place order 
4 - View customers 
5 - View products 
6 - View orders 
7 - Remove product 
8 - Edit product 
9 - Remove customer 
10 - Edit customer 
11 - Exit application 

# Data Storage

The application is session-based. Customer, product and order information is stored in ArrayLists in memory while the application is running.

No database or persistent storage is used. All information is lost when the application is closed.

# Author

Alex McKeever

Munster Technological University