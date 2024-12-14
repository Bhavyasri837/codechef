import java.util.*;
import java.lang.*;
import java.io.*;

public class volumecontrol {
   
    public static void main(String args[])
    {
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++)
		{
		    int x=sc.nextInt();
		    int y=sc.nextInt();
        if(x>y)
        System.out.println(x-y);
        else if(x<y)
        System.out.println(y-x);
        else
        System.out.println(x-y);
		}
    }
}
