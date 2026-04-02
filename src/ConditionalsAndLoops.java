public class ConditionalsAndLoops {
    public void conditional(int num) {
        // if else :-
        //  A conditional statement is used to make decisions in a program. It checks a condition and executes different
        //  code depending on whether the condition is true or false.

        if (num > 0) {
            System.out.println(num + "is positive number");
        } else if (num < 0) {
            System.out.println(num + "is negative number");
        } else {
            System.out.println(num + "is Zero");
        }

        // Switch case

        int day = 3;

        switch(day) {
            case 1:
                System.out.println("Monday");
                break;

            case 2:
                System.out.println("Tuesday");
                break;

            case 3:
                System.out.println("Wednesday");
                break;

            default:
                System.out.println("Invalid day");
        }
    }

    public void loops() {
        //Loops :-
        //  A loop is used to repeat a block of code multiple times until a condition is met.

        //Common types :-
        //  for loop (repeats a fixed number of times)
        //  while loop (repeats while a condition is true)
        //  do while loop (repeats while a condition is true and run at least one time)

        // for loop
        System.out.println("Print 1 to 5 using for loop: ");
        for (int i = 1; i <= 5; i++) {
            System.out.print(i);
        }

        // while loop
        System.out.println("Print 1 to 5 using while loop: ");
        int num = 1;
        while (num <= 5) {
            System.out.print(num);
            num++;
        }

        // do while
        System.out.println("Print 1 to 5 using do while loop: ");
        int n = 1;
        do {
            System.out.print(n);
            n += 1;
        } while (n <= 5);
    }
}
