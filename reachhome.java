import java.util.*;
import java.lang.*;
import java.io.*;
public class reachhome {
public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++)
		{
		    int x=sc.nextInt();
		    int y=sc.nextInt();
		    if((5*x)>=y)
		    System.out.println("YES");
		    else
		    System.out.println("No");
		}

	}
}
