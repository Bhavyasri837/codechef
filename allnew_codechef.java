import java.util.*;
import java.lang.*;
import java.io.*;
public class allnew_codechef {
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
    Scanner sc=new Scanner(System.in);
    int x=sc.nextInt();
    int y=sc.nextInt();
    if(x<y)
    System.out.println("OLD");
    else if(x>y)
    System.out.println("NEW");
    else if(x==y)
    System.out.println("SAME");
	}
}

