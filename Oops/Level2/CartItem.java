public class CartItem {
    String itemName;
    double price;
    int quantity;

    public CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public void addItem(int qty) {
        this.quantity += qty;
        System.out.println(qty + " " + itemName + "(s) added to cart.");
    }

    public void removeItem(int qty) {
        if (qty <= quantity) {
            this.quantity -= qty;
            System.out.println(qty + " " + itemName + "(s) removed from cart.");
        } else {
            System.out.println("Not enough items to remove!");
        }
    }

    public void displayTotalCost() {
        double totalCost = price * quantity;
        System.out.println("Item: " + itemName + " | Quantity: " + quantity + " | Total Cost: " + totalCost);
    }

   
    public static void main(String[] args) {
        
        CartItem item1 = new CartItem("Laptop", 55000.0, 1);

        item1.displayTotalCost();
        System.out.println();

        
        item1.addItem(2);
        item1.displayTotalCost();
        System.out.println();

       
        item1.removeItem(1);
        item1.displayTotalCost();
        System.out.println();

        item1.removeItem(5);
        item1.displayTotalCost();
    }
}
