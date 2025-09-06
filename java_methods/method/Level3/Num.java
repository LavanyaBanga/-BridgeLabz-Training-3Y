import java.util.Arrays;

public class Num{

    public static int countDigits(int num) {
        return String.valueOf(Math.abs(num)).length();
    }
    public static int[] getDigits(int num) {
        String s = String.valueOf(Math.abs(num));
        int[] digits = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            digits[i] = s.charAt(i) - '0';
        }
        return digits;
    }
    public static int sumOfDigits(int[] digits) {
        int sum = 0;
        for (int d : digits) {
            sum += d;
        }
        return sum;
    }

    public static int sumOfSquares(int[] digits) {
        int sum = 0;
        for (int d : digits) {
            sum += Math.pow(d, 2);
        }
        return sum;
    }

    public static boolean isHarshad(int num) {
        int[] digits = getDigits(num);
        int sum = sumOfDigits(digits);
        return num % sum == 0;
    }

    public static int[][] digitFrequency(int num) {
        int[] digits = getDigits(num);
        int[][] freq = new int[10][2];

       
        for (int i = 0; i < 10; i++) {
            freq[i][0] = i;
            freq[i][1] = 0;
        }
  // Count frequency
        for (int d : digits) {
            freq[d][1]++;
        }

        return freq;
    }

    public static void main(String[] args) {
        int number = 21; 
        int[] digits = getDigits(number);

        System.out.println("Number: " + number);
        System.out.println("Digits: " + Arrays.toString(digits));
        System.out.println("Count of Digits: " + countDigits(number));
        System.out.println("Sum of Digits: " + sumOfDigits(digits));
        System.out.println("Sum of Squares of Digits: " + sumOfSquares(digits));
        System.out.println("Is Harshad Number: " + isHarshad(number));

        // Frequency table
        int[][] freq = digitFrequency(number);
        System.out.println("Digit Frequency:");
        for (int i = 0; i < freq.length; i++) {
            if (freq[i][1] > 0) {
                System.out.println("Digit " + freq[i][0] + " -> " + freq[i][1] + " times");
            }
        }
    }
}
