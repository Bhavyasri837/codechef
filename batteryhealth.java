import java.util.*;
import java.lang.*;
import java.io.*;

class batteryhealth
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        for(int i=1;i<=T;i++)
        {
            int X=sc.nextInt();
            if(X>=80)
            {
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
	}
}
