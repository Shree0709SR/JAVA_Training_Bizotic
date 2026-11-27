package DAY3.Session1;
import java.util.Scanner;
public class Prg17StairsClimbing {
    public static int climbStairs(int n) {
        if (n<=2)
            return n;
        else {
            return climbStairs(n-1) + climbStairs(n-2);
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of stairs: ");
        int n = sc.nextInt();
        System.out.println("The number of ways to climb the stairs is: " + climbStairs(n));
    }
}
