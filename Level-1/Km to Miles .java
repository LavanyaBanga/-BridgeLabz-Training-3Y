// Class to convert km to miles with user input
import java.util.Scanner;

class KmToMilesInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input distance in km
        System.out.print("Enter distance in kilometers: ");
        double km = input.nextDouble();

        // Convert km to miles
        double miles = km / 1.6;

        // Display result
        System.out.println("The total miles is " + miles + " mile for the given " + km + " km");
    }
}
