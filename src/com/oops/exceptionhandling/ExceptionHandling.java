package com.oops.exceptionhandling;

import java.util.Scanner;

// Exception Handling in Java
//      Exception Handling is used to handle runtime errors so the program can continue execution normally.

// Example:
//      Divide by zero
//      Array index out of bounds
//      Null pointer access
//      File not found

// 1. Checked Exception
//      Checked at compile time.
//      Examples: IOException, SQLException

// 2. Unchecked Exception
//      Occurs at runtime.
//      Examples: ArithmeticException, NullPointerException, ArrayIndexOutOfBoundsException

public class ExceptionHandling {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();

        // try {}     -> Contains risky code
        // catch() {} -> Handles exception
        // finally {} -> always executes whether exception occurs or not.

        try {
            int c = divide(a,b);
            System.out.println(c);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage() );
        } catch (Exception e) {
            System.out.println("Exception block execute");
        } finally {
            System.out.println("Always finally block will execute");
        }
    }

    // throw  -> Used to manually throw an exception.
    // throws -> Used to declare exceptions.

    static int divide(int a, int b) throws ArithmeticException {
        if ( b == 0 ) {
            throw new ArithmeticException();
        }
        return a / b;
    }
}

