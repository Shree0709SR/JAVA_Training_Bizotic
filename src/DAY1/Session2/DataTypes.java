package DAY1.Session2;
enum Days{
    Monday,
    Tuesday,        
    Wednesday,
    Thursday,
    Friday,
    Saturday,
    Sunday
}

public class DataTypes {
    public static void main(String[] args) {

        int number = 5;
        float floatNumber = 5.5f;
        double doubleNumber = 5.5;
        boolean isTrue = true;
        byte byteNumber = 100;
        char charNumber = 'A';
        
        int a = 10;
        double result = a; // Implicit Type Casting (Widening)
        // System.out.println("Implicit Type Casting (Widening): " + result);
        
        double b = 20.5;
        int result2 = (int) b; // Explicit Type Casting (Narrowing)
        // System.out.println("Explicit Type Casting (Narrowing): " + result2);

        Days day = Days.Monday;
        System.out.println("Day: " + day);
    }
}



















