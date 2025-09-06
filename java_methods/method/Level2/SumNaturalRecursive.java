import java.util.Scanner;

public class SumNaturalRecursive {
    public static int recursiveSum(int n) {
        if (n == 0) return 0;
        return n + recursiveSum(n - 1);
    }

    public static int formulaSum(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Not a natural number!");
            return;
        }

        int sumRec = recursiveSum(n);
        int sumFormula = formulaSum(n);

        System.out.println("Recursive sum = " + sumRec);
        System.out.println("Formula sum = " + sumFormula);
        System.out.println("Both are equal: " + (sumRec == sumFormula));
    }
}
