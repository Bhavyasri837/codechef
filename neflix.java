import java.util.*;
import java.lang.*;
import java.io.*;

class neflix
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
		    int c=sc.nextInt();
		    int x=sc.nextInt();
		    if((a+b)>=x||(b+c)>=x||(c+a)>=x)
		    System.out.println("YES");
		    else 
		    System.out.println("NO");
		    
		}

	}
}
