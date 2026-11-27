package DAY3.Session2;
import java.util.Scanner;
public class Prg18PowerOf2 {
    public boolean isPowerOfTwo(int n) {
        long res;
        int t =-1;
        boolean result = false;
        do {
            t++;
            res =(long)Math.pow(2,t);
            if (res==n){
                result = true;
                break;
            }
            if (res>n || n==0){
                break;
            }
        }while(true);
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        Prg18PowerOf2 obj = new Prg18PowerOf2();
        if (obj.isPowerOfTwo(n)) {
            System.out.println(n + " is a power of 2.");
        } else {
            System.out.println(n + " is not a power of 2.");
        }
    }
}

