import java.util.*;
class rearranging_digits {
public static void main(String args[])
{
     Scanner sc=new Scanner(System.in);
     int t=sc.nextInt();
     for(int i=0;i<t;i++)
     {
         int d=sc.nextInt();
         String n=sc.next();
         boolean flag=false;
         for(int j=0;j<d;j++)
         {
             if(n.charAt(j)=='0'||n.charAt(j)=='5')
             flag=true;
         }
         if(flag)
         System.out.println("YES");
         else
         System.out.println("NO");
        }
    }
}
