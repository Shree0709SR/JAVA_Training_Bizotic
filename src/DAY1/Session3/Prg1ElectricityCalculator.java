/*Program 1: Electricity Bill Calculator (Easy) Problem Statement: 
A state electricity board charges customers based on units consumed. 
The pricing tiers are: 
• First 100 units: Rs 1.50 per unit 
• Next 100 units (101 to 200): Rs 2.50 per unit 
• Above 200 units: Rs 4.00 per unit Given the number of units consumed, calculate the total electricity bill amount. */

package DAY1.Session3;
import java.util.Scanner;

public class Prg1ElectricityCalculator {
    public static double calculateElectricityBill (double units) {
        double billAmount = 0.0;
        billAmount = (units<=100)? units*1.5: ((units<=200)? (units-100)*2.5+100*1.5 : ((units-200)*4.00+100*2.5+100*1.5)); 
        return billAmount;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of units : ");
        double units = scanner.nextDouble();
        double totalBill = calculateElectricityBill(units);
        scanner.close();
        System.out.println("Total electricity bill for " + units + " units: $" + totalBill);
    }
    
}
