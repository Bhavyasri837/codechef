import java.util.Scanner;

public class take_discount_or_not{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            int[] a = new int[n];
            int sum=0;
            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
                sum+=a[i];
            }
              int total = x;
            for (int i = 0; i < n; i++) 
            {
                total += Math.max(a[i] - y, 0);
            }
            
            if (total < sum) {
                System.out.println("COUPON");
            } else {
                System.out.println("NO COUPON");
            }

        }
    }
}
