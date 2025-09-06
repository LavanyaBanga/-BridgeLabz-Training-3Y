public class perfect{

    
    public static boolean isPerfect(int num) {
        int sum = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        return sum == num;
    }

    
    public static boolean isAbundant(int num) {
        int sum = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        return sum > num;
    }

   
    public static boolean isDeficient(int num) {
        int sum = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        return sum < num;
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
        int num = 28;  // You can change this number

        System.out.println(num + " is Perfect? " + isPerfect(num));
        System.out.println(num + " is Abundant? " + isAbundant(num));
        System.out.println(num + " is Deficient? " + isDeficient(num));
        System.out.println(num + " is Strong? " + isStrong(num));
    }
}
