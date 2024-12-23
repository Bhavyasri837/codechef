import java.util.Scanner;

public class ratingorder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] d = new int[n];
        
            for (int i = 0; i < n; i++) {
                d[i] = scanner.nextInt();
            }

            // Flag to check if the sequence is non-decreasing
            boolean isNonDecreasing = true;

            // Check if the sequence is in non-decreasing order
            for (int i = 0; i < n - 1; i++) {
                if (d[i] > d[i + 1]) {
                    isNonDecreasing = false;  // If any element is greater than the next, it's not non-decreasing
                    break;  // No need to check further
                }
            }

            // Output the result for the current test case
            if (isNonDecreasing) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        
        scanner.close();
    }
}
