import java.util.Random;

public class RandomNumbers {
    public static int[] generate4DigitRandomArray(int size) {
        Random rand = new Random();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = 1000 + rand.nextInt(9000); // 4-digit
        }
        return arr;
    }

    public static double[] findAverageMinMax(int[] numbers) {
        int min = numbers[0], max = numbers[0], sum = 0;
        for (int n : numbers) {
            sum += n;
            min = Math.min(min, n);
            max = Math.max(max, n);
        }
        double avg = (double) sum / numbers.length;
        return new double[]{avg, min, max};
    }

    public static void main(String[] args) {
        int[] nums = generate4DigitRandomArray(5);

        System.out.print("Numbers: ");
        for (int n : nums) System.out.print(n + " ");
        System.out.println();

        double[] result = findAverageMinMax(nums);
        System.out.println("Average = " + result[0]);
        System.out.println("Min = " + result[1]);
        System.out.println("Max = " + result[2]);
    }
}

