/*
Program 2: PIN Validation System (Medium)
Problem Statement:
A banking app allows the user 3 attempts to enter the correct 4-digit PIN. The correct PIN is 1234 
(hardcoded for this problem).
On each wrong attempt, print "INCORRECT, X attempts remaining" (where X is the number of 
attempts left).
If all 3 attempts fail, print "ACCOUNT LOCKED".
If the correct PIN is entered, print "ACCESS GRANTED".
Examples:
• Input: 1234 (first attempt). Output: ACCESS GRANTED.
• Input: 0000, 0000, 0000. Output: INCORRECT, 2 attempts remaining. INCORRECT, 1 
attempts remaining. INCORRECT, 0 attempts remaining. ACCOUNT LOCKED.
• Input: 1111, 1234. Output: INCORRECT, 2 attempts remaining. ACCESS GRANTED.*/

package DAY3.Session3;
import java.util.Scanner;

public class Prg22PinValidation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int correctPIN = 1234;
        int attempts = 3;

        while (attempts > 0) {
            System.out.print("Enter PIN: ");
            int enteredPIN = scanner.nextInt();

            if (enteredPIN == correctPIN) {
                System.out.println("ACCESS GRANTED");
                return;
            } else {
                attempts--;
                if (attempts > 0) {
                    System.out.println("INCORRECT, " + attempts + " attempts remaining");
                }
            }
        }

        System.out.println("ACCOUNT LOCKED");
    }
}
