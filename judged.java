import java.util.*;
import java.lang.*;
import java.io.*;

class judged
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            int r1=sc.nextInt();
            int r2=sc.nextInt();
            int r3=sc.nextInt();
            int r4=sc.nextInt();
            int r5=sc.nextInt();
            if((r1+r2+r3+r4+r5)>=4)
            System.out.println("YES");
            else
            System.out.println("NO");
            
            
        }
	}
}
