package DAY1.Session3;
import java.util.Scanner;

public class Prg2EmployeeSalary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Basic Salary: ");
        double basicSalary = scanner.nextDouble();  
        double hra = 0.20 * basicSalary;
        double da = 0.50 * basicSalary;
        double grossSalary = basicSalary + hra + da;
        System.out.println("Gross Salary: " + grossSalary);
        double tax = 0.10*grossSalary;
        double pf = 0.12*basicSalary;
        System.out.println("Total Reductions: " + (tax + pf));
        double netSalary = grossSalary - tax - pf;
        System.out.println("Net Salary: " + netSalary);

    }
    
}
