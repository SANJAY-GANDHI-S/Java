package com.basic;

public class Recursion {

    // Recursion in Java is a programming technique where a method calls itself to solve a problem.
    // Instead of using loops, the method breaks a problem into smaller subproblems and solves each one by calling itself repeatedly.
    //
    // A recursive method always has two important parts:
    //
    // 1. Base case
    //      This is the condition where the method stops calling itself. Without it, the program would run forever (infinite recursion).
    //
    // 2. Recursive case
    //      This is where the method calls itself with a smaller or simpler input.

    public static void main(String[] args) {
        Recursion r = new Recursion();
        int[] arr = new  int[1];

        System.out.println(r.fibonacci(4));
    }

    // Understanding the Recursion
    //      1). Identify if you can break down problem into Smaller problem
    //      2). Write the recurrence relation if needed
    //      3). Draw the recursion tree
    //      4) About the tree
    //          => see the flow of function how they are getting in stack
    //          => Identify & focus on left calls and right tree calls
    //          => Draw the tree and pointer paper again and again using pen and paper
    //          => use the debugger to see
    //       5).See how the value return at each step. See where the Junction call will coming out of.
    //       In the End you will come out of the main function.

    // Key Areas to be focused on Recursion!-
    //
    //  Variables :-    1) Arguments
    //                  2) Return type
    //                  3) Body of function

    public int fibonacci(int n) {
        if ( n < 2 ) {
            return n;
        }

        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
