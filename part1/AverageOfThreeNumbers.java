/*
Write a program that asks the user for three integers and prints their average.

Give the first number:
8
Give the second number:
2
Give the third number:
3
The average is 4.333333333333333

Give the first number:
9
Give the second number:
5
Give the third number:
-1
The average is 4.333333333333333
*/


import java.util.Scanner;

public class AverageOfThreeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Give the first number:");
        int first=Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int second=Integer.valueOf(scanner.nextLine());
        System.out.println("Give the third number:");
        int third=Integer.valueOf(scanner.nextLine());
        System.out.println("The average is "+((1.0*first+second+third)/3));
        

    }
}
