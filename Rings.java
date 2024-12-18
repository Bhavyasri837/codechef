import java.util.Scanner;

public class Rings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            int x = scanner.nextInt();
            int res=n*x;
            String str=String.valueOf(res);
            int arr[]=new int[str.length()];
            for(int i=0;i<str.length();i++)
            {
                arr[i]=Character.getNumericValue(str.charAt(i));
            }
            if((arr[0]!=0)&&(arr.length==5))
            System.out.println("YES");
            else
            System.out.println("NO");
        }
    }
}
