import java.util.Scanner;

public class TriangularPark {
    public static double calculateRounds(int a, int b, int c, double distance) {
        int perimeter = a + b + c;
        return distance / perimeter;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side 1: ");
        int a = sc.nextInt();
        System.out.print("Enter side 2: ");
        int b = sc.nextInt();
        System.out.print("Enter side 3: ");
        int c = sc.nextInt();

        double rounds = calculateRounds(a, b, c, 5000); // 5km = 5000m
        System.out.println("The athlete must complete " + Math.ceil(rounds) + " rounds.");
    }
}
