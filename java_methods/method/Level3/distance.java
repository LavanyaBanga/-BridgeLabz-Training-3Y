import java.util.Scanner;

public class distance{

    // Method to calculate Euclidean Distance
    public static double euclideanDistance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    // Method to find line equation coefficients (slope m and intercept b)
    public static String lineEquation(int x1, int y1, int x2, int y2) {
        if (x2 == x1) {
            // Vertical line
            return "x = " + x1;
        }
        double m = (double) (y2 - y1) / (x2 - x1);
        double b = y1 - m * x1;

        // Format slope & intercept with 2 decimal places
        String slope = String.format("%.2f", m);
        String intercept = String.format("%.2f", b);

        // Handle negative intercept for neat display
        if (b >= 0) {
            return "y = " + slope + "x + " + intercept;
        } else {
            return "y = " + slope + "x - " + intercept.substring(1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter x1: ");
        int x1 = sc.nextInt();
        System.out.print("Enter y1: ");
        int y1 = sc.nextInt();
        System.out.print("Enter x2: ");
        int x2 = sc.nextInt();
        System.out.print("Enter y2: ");
        int y2 = sc.nextInt();

        // Distance
        double distance = euclideanDistance(x1, y1, x2, y2);
        System.out.printf("Euclidean Distance: %.2f%n", distance);

        // Line Equation
        String equation = lineEquation(x1, y1, x2, y2);
        System.out.println("Equation of the line: " + equation);

        sc.close();
    }
}
