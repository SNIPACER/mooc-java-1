/*
Implement a program, which calculates the sum 1+2+3+...+n where n is 
given as user input.

Sample output:
-------------
Last number? 3
The sum is 6
//The previous example calculated 1 + 2 + 3 = 6


Last number? 7
The sum is 28
//And this one calculated 1 + 2 + 3 + 4 + 5 + 6 + 7 = 28

*/
import java.util.Scanner;
 
public class SumOfASequence {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value = 0;
        System.out.println("Last number? ");
        int number = Integer.valueOf(scanner.nextLine());
        for (int i = 1; i <= number; i++) {
            value = value + i;
        }
        System.out.println("The sum is " + value);
    }
}
