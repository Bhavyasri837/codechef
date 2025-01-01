import java.util.*;
import java.lang.*;
import java.io.*;

class wordle
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		for(int i=0;i<T;i++)
		{
		    String s=sc.next();
		    String t=sc.next();
		    for(int j=0;j<s.length();j++)
		    {
		        if(s.charAt(j)==t.charAt(j))
		        {
		            System.out.print("G");
		        }
		        else{
		            System.out.print("B");
		        }
		    }
		    System.out.println();
		}

	}
}
