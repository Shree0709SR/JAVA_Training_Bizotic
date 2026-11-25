/*Problem Statement: An ATM machine processes withdrawal requests. Given: current balance,
 withdrawal amount, and account type (1 = Savings, 2 = Current). 
 Validation rules (checked in this order): 
 1. Withdrawal amount must be a multiple of 100.If not, print "NOT A MULTIPLE OF 100". 
 2. Withdrawal amount must not exceed 50,000. If it does, print "EXCEEDS MAXIMUM LIMIT". 
 3. For Savings accounts: balance after withdrawal must be at least 500 (minimum balance requirement). 
 If not, print "INSUFFICIENT BALANCE (minimum 500 must remain)". 
 4. For Current accounts: no minimum balance, but withdrawals above 25,000 incur a Rs 50 processing fee. 
 If all validations pass: • For Savings: new balance = balance - amount. Print "SUCCESS. New balance: [amount]". 
 • For Current with amount > 25000: new balance = balance - amount - 50. Print "SUCCESS. Fee: 50. New balance: [amount]". 
 • For Current with amount <= 25000: new balance = balance - amount. Print "SUCCESS. New balance: [amount]". */

package DAY1.Session3;
import java.util.*;

public class Prg4ATMWithdrawal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double bal = sc.nextDouble();
        double amount = sc.nextDouble();
        int type = sc.nextInt();
        if (amount%100 != 0) {
            System.out.println("NOT A MULTIPLE OF 100");
            
        } else if (amount > 50000) {
            System.out.println("EXCEEDS MAXIMUM LIMIT");
            
        } else if (type == 1) {
            if ((bal-amount) < 500) {
                System.out.println("INSUFFICIENT BALANCE (minimum 500 must remain)");
            }else {
                System.out.println("SUCCESS. New balance: " + (bal-amount));
            }

        }else if (type == 2) {
            if (amount <25000) {
                System.out.println("Amount should be greater than 25000");
            }else {
                if (bal < amount) {
                    System.out.println("INSUFFICIENT BALANCE (minimum 500 must remain)");
                }else {
                    System.out.println("SUCCESS. New balance: " + (bal-amount));
                    bal = bal-amount-50;
                    System.out.println("Balance: " + bal);
                }
            }
        }
    sc.close();
    }
}
