package DAY1.Session2;

public class WrapperClassExample {
    public static void main(String[] args) {
        int a = 10;
        System.out.println("Value of a: " + a);
        //Boxing: Converting primitive type to wrapper class object
        Integer b = new Integer(a);
        System.out.println("Value of b after boxing: " + b);
        //Auto-boxing: Converting primitive type to wrapper class object automatically
        Integer c = a;
        System.out.println("Value of d after auto-boxing: " + c);
        //Unboxing: Converting wrapper class object to primitive type
        int d = b.intValue();   
        System.out.println("Value of c after unboxing: " + d);
        //Auto-unboxing: Converting wrapper class object to primitive type automatically
        int e = c;
        System.out.println("Value of e after auto-unboxing: " + e); 
    }
    
}
