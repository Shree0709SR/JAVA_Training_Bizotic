/*Challenge 1: Movie Ticket Pricing System (Medium)
Problem Statement:
A cinema charges based on age, show time, and seat type.
• Base price: Rs 200.
• Age discount: below 12 gets 50% off base, 12-59 pays full, 60+ gets 30% off base.
• Time discount: morning show (hour < 12 in 24-hr format) gets 20% off the age-adjusted 
price.
• Seat type: 1 = Regular (no extra), 2 = Premium (+Rs 100), 3 = Recliner (+Rs 250).
Given age, show time (hour in 24-hr format), and seat type, calculate the final ticket price.
Examples:
• Input: age=10, hour=10, seat=1. Base=200, age discount=50%, price=100, morning=20% 
off, price=80, Regular=no extra. Final: 80.00.
22
• Input: age=25, hour=20, seat=3. Base=200, no age discount, price=200, not morning, 
price=200, Recliner +250. Final: 450.00*/
package DAY3.Session3;
import java.util.Scanner;

public class Prg23MovieTicketPricing {
    public static double calculateTicketPrice(int age, int hour, int seatType) {
        double basePrice = 200.0;
        double ageDiscount = 0.0;
        double timeDiscount = 0.0;
        double seatExtra = 0.0;

        // Age discount
        if (age < 12) {
            ageDiscount = 0.5; // 50% off
        } else if (age >= 60) {
            ageDiscount = 0.3; // 30% off
        }

        // Time discount
        if (hour < 12) {
            timeDiscount = 0.2; // 20% off
        }
        
        switch (seatType) {
            case 1: // Regular
                seatExtra = 0.0;
                break;
            case 2: // Premium
                seatExtra = 100.0;
                break;
            case 3: // Recliner
                seatExtra = 250.0;
                break;
            default:
                throw new IllegalArgumentException("Invalid seat type");
        }

        double priceAfterAgeDiscount = basePrice * (1 - ageDiscount);
        double priceAfterTimeDiscount = priceAfterAgeDiscount * (1 - timeDiscount);
        double finalPrice = priceAfterTimeDiscount + seatExtra;

        return finalPrice;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter age: ");
        int age = scanner.nextInt();
        System.out.print("Enter show time (hour in 24-hr format): ");
        int hour = scanner.nextInt();
        System.out.print("Enter seat type (1=Regular, 2=Premium, 3=Recliner): ");
        int seatType = scanner.nextInt();

        double finalPrice = calculateTicketPrice(age, hour, seatType);
        System.out.printf("Final Ticket Price: %.2f%n", finalPrice);
    }
    
}
