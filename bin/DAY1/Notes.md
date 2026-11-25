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

   # Autoboxing and Unboxing:
      - Autoboxing: The automatic conversion of a primitive data type to its corresponding wrapper class
      
      - Unboxing: The automatic conversion of a wrapper class to its corresponding primitive data type
      
