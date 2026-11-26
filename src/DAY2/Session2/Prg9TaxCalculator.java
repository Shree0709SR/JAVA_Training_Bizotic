package DAY2.Session2;
import java.util.*;

class TaxCalculation {
    public double calculateTax (double amount, double taxRate) {
        return amount * taxRate / 100;
    }
}

class TotalCalculator {
    public double calculateTotal(double amount, double taxRate) {
        TaxCalculation obj = new TaxCalculation();
        double tax = obj.calculateTax(amount, taxRate);
        System.out.println("Calculated Tax: " + tax);
        return amount + tax;
    }
}

public class Prg9TaxCalculator {
    public static void main(String[] args) {
        TotalCalculator calculator = new TotalCalculator();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the amount: ");
        double amount = sc.nextDouble();
        System.out.print("Enter the tax rate (in %): ");
        double taxRate = sc.nextDouble();
        double totalAmount = calculator.calculateTotal(amount, taxRate);
        System.out.println("Total Amount (including tax): " + totalAmount);
    }
}