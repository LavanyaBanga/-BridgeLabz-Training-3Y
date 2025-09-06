public class abundant {
    private static int sumOfDivisors(int num) {
        int sum = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        return sum;
    }
    public static boolean isPerfect(int num) {
        return sumOfDivisors(num) == num;
    }
    public static boolean isAbundant(int num) {
        return sumOfDivisors(num) > num;
    }

    public static boolean isDeficient(int num) {
        return sumOfDivisors(num) < num;
    }

    private static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
    public static boolean isStrong(int num) {
        int temp = num;
        int sum = 0;

        while (temp > 0) {
            int digit = temp % 10;
            sum += factorial(digit);
            temp /= 10;
        }

        return sum == num;
    }

   
    public static void main(String[] args) {
        int[] testNumbers = {6, 28, 12, 18, 145, 20};

        for (int num : testNumbers) {
            System.out.println("Checking number: " + num);
            System.out.println("Perfect? " + isPerfect(num));
            System.out.println("Abundant? " + isAbundant(num));
            System.out.println("Deficient? " + isDeficient(num));
            System.out.println("Strong? " + isStrong(num));
            System.out.println("-------------------");
        }
    }
}
