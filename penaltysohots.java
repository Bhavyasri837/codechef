import java.util.*;

class penaltyshots
{
	public static void main (String[] args)
	{
		Scanner read = new Scanner(System.in);
		
		int t = read.nextInt();
		int ele;
		for(int i=0; i<t; i++)
		{
    		int n = 10;
    		ArrayList<Integer> a = new ArrayList<Integer>();
    		for(int j=0; j<n; j++){
    		    ele = read.nextInt();
    		    a.add(ele);
    		}
    		// Update your code below this line to solve the problem
             int team1 = a.get(0) + a.get(2) + a.get(4) + a.get(6) + a.get(8);
            int team2 = a.get(1) + a.get(3) + a.get(5) + a.get(7) + a.get(9);
            
            // Apply relevant conditions to check for victory
            if(team1 > team2){
                System.out.println(1);
            }
            else if(team1 < team2){
                System.out.println(2);
            }
            else{
                System.out.println(0);
            }
		}
	}
}
