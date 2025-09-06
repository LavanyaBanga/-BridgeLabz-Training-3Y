import java.util.Random;

public class NumberChecker{
    public static void main(String[] args) {
        int[] heights = generateRandomHeights(11, 150, 250);

        System.out.println("Player Heights (cms): ");
        for (int h : heights) System.out.print(h + " ");
        System.out.println();

        System.out.println("Shortest Height: " + findShortest(heights));
        System.out.println("Tallest Height: " + findTallest(heights));
        System.out.println("Mean Height: " + findMean(heights));
    }

    public static int[] generateRandomHeights(int n, int min, int max) {
        Random rand = new Random();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = rand.nextInt(max - min + 1) + min;
        return arr;
    }

    public static int findShortest(int[] arr) {
        int min = arr[0];
        for (int h : arr) if (h < min) min = h;
        return min;
    }

    public static int findTallest(int[] arr) {
        int max = arr[0];
        for (int h : arr) if (h > max) max = h;
        return max;
    }

    public static double findMean(int[] arr) {
        int sum = 0;
        for (int h : arr) sum += h;
        return (double) sum / arr.length;
    }
}
