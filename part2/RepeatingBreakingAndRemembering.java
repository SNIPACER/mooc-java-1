/*
Reading
-------
Implement a program that asks the user for numbers (the program first 
prints "Write numbers: ") until the user gives the number -1. 
When the user writes -1, the program prints "Thx! Bye!" and ends

Sum of numbers
--------------
Extend the program so that it prints the sum of the numbers 
(not including the -1) the user has written.

Sum and the number of numbers
-------------------------------
Extend the program so that it also prints the number of numbers 
(not including the -1) the user has written.

Average of numbers
--------------------
Extend the program so that it prints the mean of the numbers 
(not including the -1) the user has written.


Even and odd numbers
---------------------
Extend the program so that it prints the number of even and odd 
numbers (excluding the -1).

output:-
-----------
Give numbers:
5
2
4
-1
Thx! Bye!
Sum: 11
Numbers: 3
Average: 3.666666666666
Even: 2
Odd: 1


*/


import java.util.Scanner;
 
public class RepeatingBreakingAndRemembering {
 
    public static void main(String[] args) {
 
        // This exercise is worth five exercise points, and it is 
        // gradually extended part by part.
        // If you want, you can send this exercise to the server
        // when it's just partially done. In that case the server will complain about 
        // the parts you haven't done, but you'll get points for the finished parts.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give numbers:");
        int input = 0;
        int sum = 0;
        int count = 0;
        int even = 0;
        int odd = 0;
        while (true) {
            int number = Integer.valueOf(scanner.nextLine());
            if (number == -1) {
                System.out.println("Thx! Bye!");
                break;
            }
            sum = sum + number;
            count += 1;
            if (number % 2 == 0) {
                even += 1;
            } else {
                odd += 1;
            }
 
        }
 
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + count);
        System.out.println("Average: " + (1.0 * sum / count));
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);
    }
}
