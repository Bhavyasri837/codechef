import java.util.*;
import java.lang.*;
import java.io.*;

class ATM
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		float y=sc.nextFloat();
	
	    if((x%10)==0||(x%10)==5)
	    {
	        System.out.println((y-x)-0.50);
	    }
        else
        System.out.println(y);
	}
}
