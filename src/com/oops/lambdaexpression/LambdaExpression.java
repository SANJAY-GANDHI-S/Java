package com.oops.lambdaexpression;

// Lambda Expression:-
//      A Lambda Expression in Java is a short way to write an anonymous function (function without name).
//      It was introduced in Java 8 and mainly used with Functional Interfaces.

// Syntax:-
//      (parameters) -> expression
// (or)
//      (parameters) -> {
//          // block of code
//      }

public class LambdaExpression {
    public static void main(String[] args) {
        Operation sum = (a, b) -> a + b;
        Operation mul = (a, b) -> a * b;
        Operation sub = (a, b) -> a - b;

        LambdaExpression le = new LambdaExpression();
        System.out.println(le.operation(5,6,sum));
        System.out.println(le.operation(5,6,mul));
        System.out.println(le.operation(5,6,sub));

        System.out.println(sum.operation(11,11));
    }

    private int operation(int a, int b, Operation op) {
        return op.operation(a, b);
    }
}

interface Operation {

    int operation(int a, int b);

}
