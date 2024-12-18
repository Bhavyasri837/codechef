import java.util.*;
import java.lang.*;
import java.io.*;

class betterdeal
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            int a=sc.nextInt();
            int b=sc.nextInt();
            double r1=100-(a*(100/100));
            double r2=200-(b*(200/100));
        if(r1<r2)
        {
        System.out.println("FIRST");
        }
        else if(r1>r2)
        {
        System.out.println("SECOND");
        }
        else 
        {
        System.out.println("BOTH");
        }
        }
	}
}
