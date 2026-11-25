package DAY1.Session2;
import java.io.*;
import java.util.*;

public class StringBufferExample {
    public static void main(String[] args) {

        BufferedReader strb = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter a string: ");
        try {
            String string = strb.readLine();
            System.out.println("You entered: " + string);
        } catch (IOException e) {
            System.out.println("An error occurred while reading input.");
        }

        StringBuffer sb = new StringBuffer("Hello");
        System.out.println("Original StringBuffer: " + sb);
        
        // Append
        sb.append(" World");
        System.out.println("After append: " + sb);
        
        // Insert
        sb.insert(5, ",");
        System.out.println("After insert: " + sb);
        
        // Replace
        sb.replace(6, 10, "Java");
        System.out.println("After replace: " + sb);
        
        // Delete
        sb.delete(5, 6);
        System.out.println("After delete: " + sb);
        
        // Reverse
        sb.reverse();
        System.out.println("After reverse: " + sb);
    }
}
