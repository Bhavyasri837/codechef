import java.util.*;
import java.lang.*;
import java.io.*;
public class donationrewards{
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++)
		{
		    int x=sc.nextInt();
		    if(x<=3)
		    System.out.println("BRONZE");
		    else if(x>3&&x<=6)
		    System.out.println("SILVER");
		    else if(x>6)
		    System.out.println("GOLD");
		}

	}
}
}

