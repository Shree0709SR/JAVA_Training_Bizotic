package DAY2.Session3;
import java.util.Arrays;
import java.util.Scanner;

public class Prg14Palindrome {

    public static boolean isPalindrome(int n) {
        if (n < 0) return false;
        int original = n, reversed = 0;
        while (n > 0) {
            reversed = reversed * 10 + n % 10;
            n /= 10;
        }
        return original == reversed;
    }

    public static int[] findPalindromes(int start, int end) {
        int count = 0;
        for (int i = start; i <= end; i++) {
            if (isPalindrome(i)) {
                count++;
            }
        }

        int[] result = new int[count];
        int index = 0;
        for (int i = start; i <= end; i++) {
            if (isPalindrome(i)) {
                result[index++] = i;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number to check palindrome: ");
        int num = sc.nextInt();
        System.out.println("isPalindrome(" + num + ") = " + isPalindrome(num));

        System.out.print("Enter start and end range: ");
        int start = sc.nextInt();
        int end = sc.nextInt();
        System.out.println("findPalindromes(" + start + ", " + end + ") = " + Arrays.toString(findPalindromes(start, end)));

        sc.close();
    }
}


