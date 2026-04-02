import java.util.Scanner;

public class DataType {
    public static void main(String[] args) {
        // Command Line
        /*
            Multiline commands
        */

        // Data Types :-
        //   A data type is a classification that specifies the type of data a variable can hold.

        // 1. Primitive Data Types :-
        //      Primitive data types are the basic built-in types that store simple values directly in memory.

        // 2. Non-Primitive (Reference) Data Types :-
        //      Non-primitive data types are complex types that store references (memory addresses) instead of actual values.

        // Examples:
        // String, Arrays, Classes, Interfaces

        // Integer types
        byte b = 127;        // Range: -128 to 127
        short s = 32767;     // Range: -32,768 to 32,767
        int i = 2147483647;  // Range: -2^31 to 2^31-1
        long l = 9223372036854775807L; // Range: -2^63 to 2^63-1

        // Floating-point types
        float f = 3.4e38f;   // Approx range: ±3.4E38 (6-7 decimal digits)
        double d = 1.7e308;  // Approx range: ±1.7E308 (15 decimal digits)

        // Character type
        char c = 'A';        // Range: 0 to 65,535 (Unicode values)

        // Boolean type
        boolean bool = true;

        String str = "Hello World";

        // Input
        System.out.println("Please, Enter your name");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();

        //Output
        System.out.println("My name is " + name);

        System.out.println(practice(123));
    }

    public static int practice(int num) {
//        int val = 1785757879;
        int count = 0;
        while (num > 0) {
            int temp = num % 10;
            count = count * 10 + temp;
            num = num / 10;
        }
        return count;
    }
}
