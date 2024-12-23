import java.util.Scanner;

 class mintomax{
    
    // Function to process each test case
    public static void processTestCase(int N, int[] A) {
        // Step 1: Find the minimum value in the array
        int M = Integer.MAX_VALUE;
        for (int i = 0; i < N; i++) {
            M = Math.min(M, A[i]);
        }
        
        // Step 2: Count how many elements are strictly greater than M
        int operations = 0;
        for (int i = 0; i < N; i++) {
            if (A[i] > M) {
                operations++;
            }
        }
        
        // Step 3: Output the number of operations
        System.out.println(operations);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Read number of test cases
        int T = sc.nextInt();
        
        // Process each test case
        for (int t = 0; t < T; t++) {
            // Read size of the array
            int N = sc.nextInt();
            
            // Read the array elements
            int[] A = new int[N];
            for (int i = 0; i < N; i++) {
                A[i] = sc.nextInt();
            }
            
            // Call the function to process the current test case
            processTestCase(N, A);
        }
        
        sc.close();
    }
}
