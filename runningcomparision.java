import java.util.Scanner;

public class runningcomparision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }

            for (int i = 0; i < n; i++) {
                b[i] = scanner.nextInt();
            }
            // Your code goes here
            int count=0;
		    for (int i=0;i<n ;i++ ){
		        int dalice=a[i]*2;
		        int dbob=b[i]*2;
		        
		        if(b[i]<=dalice && a[i]<=dbob){
		            count++;
		        }
		    }
		    System.out.println(count);
        }
    }
}
