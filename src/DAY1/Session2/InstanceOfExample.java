package DAY1.Session2;

class Example {
    
}

public class InstanceOfExample {
    public static void main(String[] args) {
        Example obj1 = new Example();
        
        if (obj1 instanceof Example) {
            System.out.println("The object is an instance of the Example class.");
        } else {
            System.out.println("The object is NOT an instance of the Example class.");
        }
    }
    
}
