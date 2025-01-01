import java.util.*;
import java.lang.*;
import java.io.*;

class mathison.java
{
	public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int k=0;k<t;k++){
            int arr[]= new int[26];
            for (int i = 0; i < 26; i++) {
                arr[i] = sc.nextInt();
            }
            String s = sc.next();
            int Total = 0;
            for (int i = 'a'; i <= 'z';i++) {
                if (s.indexOf(i) == -1) {
                    Total =Total+ arr[i - 'a'];
                }
            }
            System.out.println(Total);
        }
	}
}
