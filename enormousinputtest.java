import java.util.*;
import java.lang.*;
import java.io.*;
 class enormousinputtest
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
         int count=0;
        for(int i=1;i<=n;i++)
        {
            int m=sc.nextInt();
            if((m%k)==0)
            count++;
        }
        System.out.println(count);
    }
}
