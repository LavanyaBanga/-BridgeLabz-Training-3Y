// Class to calculate discount with user input
import java.util.Scanner;

class DiscountFee {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input fee and discount percent
        System.out.print("Enter Student Fee (INR): ");
        double fee = input.nextDouble();

        System.out.print("Enter Discount Percent: ");
        double discountPercent = input.nextDouble();

        // Calculate discount and final fee
        double discount = (fee * discountPercent) / 100;
        double finalFee = fee - discount;

        // Display result
        System.out.println("The discount amount is INR " + discount + 
                           " and final discounted fee is INR " + finalFee);
    }
}
