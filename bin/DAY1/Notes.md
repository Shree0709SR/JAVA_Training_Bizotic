# Java Beginners Concepts

## Java Data types

1. Primitive Data types
   - byte    - 8bits
   - short   - 16bits
   - int     - 32bits
   - long    - 64bits
   - float   - 32bits
   - double  - 64bits
   - char    - 16bits
   - boolean

2. Non-Primitive Data types
   - String
   - Arrays
   - Classes
   - Interfaces
   - Enums

## Type Casting

1. Implicit Type Casting (Widening)
   - Converting a smaller data type to a larger data type.
   - Example: byte -> short -> int -> long -> float -> double

2. Explicit Type Casting (Narrowing)
   - Converting a larger data type to a smaller data type.
   - Example: double -> float -> long -> int -> short -> byte

## Operators

1. Arithmetic Operators
   - Addition (+)
   - Subtraction (-)
   - Multiplication (*)
   - Division (/)
   - Modulus (%)

2. Relational Operators
   - Equal to (==)
   - Not equal to (!=)
   - Greater than (>)
   - Less than (<)
   - Greater than or equal to (>=)
   - Less than or equal to (<=)

3. Logical Operators
   - AND (&&)
   - OR (||)
   - NOT (!)

4. Assignment Operators
   - Assignment (=)
   - Add and assign (+=)
   - Subtract and assign (-=)
   - Multiply and assign (*=)
   - Divide and assign (/=)
   - Modulus and assign (%=)

5. Bitwise Operators
   - AND (&)
   - OR (|)
   - XOR (^)
   - Complement (~)
   - Left shift (<<)
   - Right shift (>>)
   - Unsigned right shift (>>>)

6. Increment and Decrement Operators
   - Increment (++)
   - Decrement (--)

7. Ternary Operator
   - Conditional (?:)
   - Example: condition ? expression1 : expression2

8. Instanceof Operator
   - Used to test whether an object is an instance of a specific class or implements an interface.
   - Example: object instanceof ClassName


## Input and Output

1. Output
   - System.out.println() - Prints the output with a new line.
   - System.out.print() - Prints the output without a new line.
   - System.out.printf() - Prints the output in a formatted way.
   - Example: 
             System.out.printf("Hello, %s!", name);
   
2. Input
   a. Scanner class is used to take input from the user.
   - Example:
             import java.util.Scanner;
             Scanner scanner = new Scanner(System.in);
             int number = scanner.nextInt();
             String text = scanner.nextLine();
             long longNumber = scanner.nextLong();
             double doubleNumber = scanner.nextDouble();

   b. BufferedReader class is used to take input from the user.
   - Example:
             import java.io.BufferedReader;
             import java.io.InputStreamReader;
             BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             String text = reader.readLine();

   c. Console class is used to take input from the user.
   - Example:
             import java.io.Console;
             Console console = System.console();
             String text = console.readLine();

   d. Command line arguments are used to take input from the user.
   - Example:
             public class CommandLineExample {
                 public static void main(String[] args) {
                     for (String arg : args) {
                         System.out.println(arg);
                     }
                 }
             }


# Wrapper Classes/In-built Classes/Java-Generics/Collections

   In Java, wrapper classes are used to convert primitive data types into objects. Each primitive data type has a corresponding wrapper class. The wrapper classes are part of the java.lang package and provide methods to manipulate and convert primitive values.
   1. Wrapper Classes for Primitive Data Types:
      - byte -> Byte
      - short -> Short
      - int -> Integer
      - long -> Long
      - float -> Float
      - double -> Double
      - char -> Character
      - boolean -> Boolean

   NOTE : Strings: 
               a. String buffer: Mutable
               b. String builder: Mutable
               c. String: Immutable

   # Boxing and Unboxing

    1. Autoboxing and Unboxing:
      - Autoboxing: The automatic conversion of a primitive data type to its corresponding wrapper class
      - Example: Integer a = 10; // Auto-boxing
      - Unboxing: The automatic conversion of a wrapper class to its corresponding primitive data type
      - Example: int b = a; // Auto-unboxing

   2. Manual Boxing and Unboxing:
      - Manual Boxing: The explicit conversion of a primitive data type to its corresponding wrapper class
      - Example: Integer a = Integer.valueOf(10); // Manual boxing
      - Manual Unboxing: The explicit conversion of a wrapper class to its corresponding primitive data type
      - Example: int b = a.intValue(); // Manual unboxing

# Conditional Statements

   1. if statement
      - The if statement is used to execute a block of code if a specified condition is true.
      - Example:
                if (condition) {
                    // code to be executed if condition is true
                }

   2. if-else statement
      - The if-else statement is used to execute one block of code if a specified condition is true, and another block of code if the condition is false.
      - Example:
                if (condition) {
                    // code to be executed if condition is true
                } else {
                    // code to be executed if condition is false
                }

   3. if-else-if statement
      - The if-else-if statement is used to execute one block of code from multiple conditions  
      - Example:
                if (condition1) {
                    // code to be executed if condition1 is true
                } else if (condition2) {
                    // code to be executed if condition2 is true
                } else {
                    // code to be executed if both conditions are false
                }

   4. switch statement
      - The switch statement is used to execute one block of code from multiple options based on the
   value of a variable or expression.
      - Example:
                switch (variable) {
                    case value1:
                        // code to be executed if variable equals value1
                        break;
                    case value2:
                        // code to be executed if variable equals value2
                        break;
                    default:
                        // code to be executed if variable does not match any case
                }

   5. Nested if statement
      - A nested if statement is an if statement that is placed inside another if statement. It allows for more complex decision-making by checking multiple conditions.
      - Example:
                if (condition1) {
                    // code to be executed if condition1 is true
                    if (condition2) {
                        // code to be executed if condition2 is true
                    } else {
                        // code to be executed if condition2 is false
                    }
                } else {
                    // code to be executed if condition1 is false
                }


# Loops

   1. for loop
      - The for loop is used to execute a block of code a specific number of times.
      - Example:
                for (initialization; condition; increment/decrement) {
                    // code to be executed
                }

   2. while loop
      - The while loop is used to execute a block of code as long as a specified condition is true.
      - Example:
                while (condition) {
                    // code to be executed
                }

   3. do-while loop
      - The do-while loop is similar to the while loop, but it guarantees that the block of code will be executed at least once, even if the condition is false.
      - Example:
                do {
                    // code to be executed
                } while (condition);

   4. for-each loop (enhanced for loop)
      - The for-each loop is used to iterate over elements in an array or a collection.
      - Example:  
                for (dataType variable : arrayOrCollection) {
                    // code to be executed
                }

   5. Nested loops
      - Nested loops are loops that are placed inside another loop. The inner loop is executed for each iteration of the outer loop.
      - Example:
                for (initialization; condition; increment/decrement) {
                    // code to be executed
                    for (initialization; condition; increment/decrement) {
                        // code to be executed
                    }
                }

   # Break and Continue Statements

      1. break statement
         - The break statement is used to exit a loop or switch statement prematurely, before the loop or switch has completed all its iterations or cases.
         - Example:
                   for (int i = 0; i < 10; i++) {
                       if (i == 5) {
                           break; // exit the loop when i equals 5
                       }
                       System.out.println(i);
                   }

      2. continue statement
         - The continue statement is used to skip the current iteration of a loop and move on to the next iteration.
         - Example:
                   for (int i = 0; i < 10; i++) {
                       if (i % 2 == 0) {
                           continue; // skip even numbers
                       }
                       System.out.println(i); // print only odd numbers
                   }

      