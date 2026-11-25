/*Program 4: Loan Eligibility Checker (Hard) 
Problem Statement: A bank evaluates loan applications based on the following rules: 
Basic eligibility: 
• Age must be between 21 and 60 (inclusive). For Salaried employees (employment type = 1): 
• Annual income must be >= 3,00,000 AND • Credit score must be >= 650 AND 
• Existing loan count must be <= 2. For Self-employed (employment type = 2): 
• Annual income must be >= 5,00,000 AND 
• Credit score must be >= 700 AND 
• Existing loan count must be <= 1. Credit score bonus: If credit score >= 800, the income requirement drops by 20% for both categories. 
(Salaried: 3,00,000 becomes 2,40,000. Self-employed: 5,00,000 becomes 4,00,000.) 
If eligible: Print "ELIGIBLE" and the maximum loan amount: 
• Salaried: 3 times annual income. 
• Self-employed: 2 times annual income. If not eligible: Print "NOT ELIGIBLE" followed by the specific reason(s): 
• "Age out of range" if age is not 21-60. 
• "Income too low" if income requirement not met.  
• "Credit score too low" if credit score requirement not met. 
• "Too many existing loans" if loan count exceeds limit. */

package DAY1.Session3;
import java.util.*;

public class Prg5LoanEligiilityChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter age: ");
        int age = sc.nextInt();
        System.out.print("Enter employment type (1 for Salaried, 2 for Self-employed): ");
        int employmentType = sc.nextInt();
        System.out.print("Enter annual income: ");
        double annualIncome = sc.nextDouble();
        System.out.print("Enter credit score: ");
        int creditScore = sc.nextInt();
        System.out.print("Enter existing loan count: ");
        int existingLoanCount = sc.nextInt();

        boolean eligible = true;
        StringBuilder reasons = new StringBuilder();

        // Check age eligibility
        if (age < 21 || age > 60) {
            eligible = false;
            reasons.append("Age out of range. ");
        }

        // Adjust income requirement based on credit score
        double incomeRequirement = (employmentType == 1) ? 300000 : 500000;
        if (creditScore >= 800) {
            incomeRequirement *= 0.8; // Reduce by 20%
        }

        // Check income eligibility
        if (annualIncome < incomeRequirement) {
            eligible = false;
            reasons.append("Income too low. ");
        }

        // Check credit score eligibility
        int creditScoreRequirement = (employmentType == 1) ? 650 : 700;
        if (creditScore < creditScoreRequirement) {
            eligible = false;
            reasons.append("Credit score too low. ");
        }

        // Check existing loan count eligibility
        int loanCountLimit = (employmentType == 1) ? 2 : 1;
        if (existingLoanCount > loanCountLimit) {
            eligible = false;
            reasons.append("Too many existing loans. ");
        }

        // Output result
        if (eligible) {
            double maxLoanAmount = (employmentType == 1) ? annualIncome * 3 : annualIncome * 2;
            System.out.println("ELIGIBLE");
            System.out.println("Maximum Loan Amount: " + maxLoanAmount);
        } else {
            System.out.println("NOT ELIGIBLE");
            System.out.println(reasons.toString().trim());
        }
        sc.close();
    }
}
