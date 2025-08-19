// Class to convert height from cm to feet and inches
import java.util.Scanner;

class HeightConversion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input height in cm
        System.out.print("Enter height in cm: ");
        double heightCm = input.nextDouble();

        // Convert cm to inches
        double heightInches = heightCm / 2.54;

        // Convert to feet and inches
        int feet = (int)(heightInches / 12);
        double inches = heightInches % 12;

        // Display result
        System.out.println("Your Height in cm is " + heightCm + 
                           " while in feet is " + feet + 
                           " and inches is " + inches);
    }
}
