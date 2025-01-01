import java.util.*;
class chef_and_dolls{
public static void main (String[] args) throws java.lang.Exception{
		// your code goes here
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();  // Read the number of test cases

        // Process each test case
        while (T-- > 0) {
            int N = sc.nextInt();  // Number of dolls in the current test case
            int missingType = 0;  // Variable to store the missing doll type

            // XOR all the doll types
            for (int i = 0; i < N; i++) {
                missingType ^= sc.nextInt();  // XOR each doll type
            }

            // The result is the type that doesn't have a pair
            System.out.println(missingType);
        }
        
        sc.close();
    }
}
