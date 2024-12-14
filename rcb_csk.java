import java.util.*;
import java.lang.*;
import java.io.*;

class rcb_csk
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int X=sc.nextInt();
		int Y=sc.nextInt();
		if((X-Y)>=18)
		{
		    System.out.println("RCB");
		}
		else{
		    System.out.println("CSK");
		}

	}
}
