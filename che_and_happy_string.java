import java.util.Scanner;
public class che_and_happy_string {
    public static String checkHappyString(String S) {
        String vowels = "aeiou";
        int count = 0;
        for (char c : S.toCharArray()) {
            if (vowels.indexOf(c) != -1) { 
                count++;
                if (count > 2) {  
                    return "HAPPY";
                }
            } else {
                count = 0;  
            }
        }
        
        return "SAD";  
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine(); 
        for (int i = 0; i < T; i++) {
            String S = sc.nextLine();
            System.out.println(checkHappyString(S));
        }
        
        sc.close();
    }
}
