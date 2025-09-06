public class Item {
    int id;
    String name;
    double price;

   
    public Item(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

   
    public void displayItem() {
        System.out.println("Item Details:");
        System.out.println("ID    : " + id);
        System.out.println("Name  : " + name);
        System.out.println("Price : " + price);
    }

   
    public static void main(String[] args) {
        Item item1 = new Item(101, "Laptop", 55000.0);
        item1.displayItem();
    }
}
