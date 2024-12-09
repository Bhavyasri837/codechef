import java.util.*;
import java.lang.*;
import java.io.*;

public class tom {
public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        for(int i=1;i<=T;i++)
        {
            int X=sc.nextInt();
            int Y=sc.nextInt();
            if(X<Y)
            {
                System.out.println("YES");
            }
            else{
                System.out.println("No");
            }
        }
	}
}


