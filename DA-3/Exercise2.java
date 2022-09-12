// JAVA DA - 3
// by Dhruv Rajeshkumar Shah
// 21BCE0611

// Product class
class Product {
    private int itemNo;
    private String name;
    private double price;
    private int quantity;

    // Default constructor
    public Product() {
        itemNo = 0;
        name = "";
        price = 0;
        quantity = 0;
    }

    // Parameterized constructor
    public Product(int itemNo, String name, double price, int quantity) {
        this.itemNo = itemNo;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getItemNo() {
        return itemNo;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }
}

// Customer class
class Customer {
    private int custId;
    private String name;
    private String address;
    private String phoneNo;

    // Default constructor
    public Customer() {
        custId = 0;
        name = "";
        address = "";
        phoneNo = "";
    }

    // Parameterized constructor
    public Customer(int custId, String name, String address, String phoneNo) {
        this.custId = custId;
        this.name = name;
        this.address = address;
        this.phoneNo = phoneNo;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public int getCustId() {
        return custId;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public String toString() {
        return "Customer ID: " + custId + "\nName: " + name + "\nAddress: " + address + "\nPhone Number: " + phoneNo;
    }
}

// Main class
public class Exercise2 {
    public static void main(String[] args) {
        // Create a product object
        Product product = new Product(1, "Laptop", 50000, 1);

        // Create a customer object
        Customer customer = new Customer(1, "Dhruv", "Mumbai", "1234567890");

        // Print the details of the product
        System.out.println("Product Details:");
        System.out.println("Item Number: " + product.getItemNo());
        System.out.println("Name: " + product.getName());
        System.out.println("Price: " + product.getPrice());
        System.out.println("Quantity: " + product.getQuantity());

        // Print the details of the customer
        System.out.println("\nCustomer Details:");
        System.out.println(customer);

        // Update the price and quantity of the product
        product.setPrice(60000);
        product.setQuantity(2);

        // Update the address and phone number of the customer
        customer.setAddress("Pune");
        customer.setPhoneNo("0987654321");

        // Print the updated details of the product
        System.out.println("\nUpdated Product Details:");
        System.out.println("Item Number: " + product.getItemNo());
        System.out.println("Name: " + product.getName());
        System.out.println("Price: " + product.getPrice());
        System.out.println("Quantity: " + product.getQuantity());

        // Print the updated details of the customer
        System.out.println("\nUpdated Customer Details:");
        System.out.println(customer);

    }
}
