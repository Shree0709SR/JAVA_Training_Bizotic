package DAY1.Session3;
import java.util.*;

public class Prg3StudentGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the marks: ");
        int marks = sc.nextInt();
        if (marks >=90) {
            System.out.println("Grade: A");
            System.out.println("Result : Distinction");
        } else if (marks >= 80) {
            System.out.println("Grade: B");
            System.out.println("Result : Distinction");
        } else if (marks >= 70) {
            System.out.println("Grade: C");
            System.out.println("Result : Pass");
        } else if (marks >= 60) {
            System.out.println("Grade: D");
            System.out.println("Result : Pass");
        } else {
            System.out.println("Grade: F");
            System.out.println("Result : Fail");
        }
    }
    
}
