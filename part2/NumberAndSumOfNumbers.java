/*
Write a program that asks the user for input until the user inputs 0. 
After this the program prints the amount of numbers inputted and the sum 
of the numbers. The number zero does not need to be added to the sum, but 
adding it does not change the results.

You need two variables to keep track of the information. Use one for keeping 
track of the numbers inputted and other for keeping track of the sum

Example output of the program:
Give a number:
5
Give a number:
22
Give a number:
9
Give a number:
-2
Give a number:
0
Number of numbers: 4
Sum of the numbers: 34



*/
import java.util.Scanner;
 
public class NumberAndSumOfNumbers {
 
    public static void main(String[] args) {
        int countNumbers=0;
        int sumOfNumbers=0;
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("Give a number:");
            int number=Integer.valueOf(scanner.nextLine());
            if(number==0){
                break;
            } else{
                countNumbers=countNumbers+1;
                sumOfNumbers=sumOfNumbers+number;
            }
        }
        System.out.println("Number of numbers: "+countNumbers);
        System.out.println("Sum of the numbers: "+sumOfNumbers);
    }
}
