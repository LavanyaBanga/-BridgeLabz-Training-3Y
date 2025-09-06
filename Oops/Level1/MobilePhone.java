public class MobilePhone {
    String brand;
    String model;
    double price;

    // Constructor
    public MobilePhone(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    // Method to display details
    public void displayDetails() {
        System.out.println("Mobile Phone Details:");
        System.out.println("Brand : " + brand);
        System.out.println("Model : " + model);
        System.out.println("Price : " + price);
    }

    
    public static void main(String[] args) {
        MobilePhone phone1 = new MobilePhone("Apple", "iPhone 15", 79999.0);
        phone1.displayDetails();

        System.out.println();

        MobilePhone phone2 = new MobilePhone("Samsung", "Galaxy S24", 69999.0);
        phone2.displayDetails();
    }
}
