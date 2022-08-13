/*
Write a program that asks the user for input until the user inputs 0. 
After this, the program prints the average of the numbers. The number zero 
does not need to be counted to the average. You may assume that the user 
inputs at least one number.

The average of the numbers can be calculated by dividing the sum of numbers
with the amount of the numbers

Example output of the program:
-------------------------------
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
Average of the numbers: 8.5



*/

import java.util.Scanner;
 
public class AverageOfNumbers {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countNumber=0;
        int sumOfNumbers=0;
        while(true){
            System.out.println("Give a number:");
            int number=Integer.valueOf(scanner.nextLine());
            if(number==0){
                break;
            } else{
                countNumber=countNumber+1;
                sumOfNumbers=sumOfNumbers+number;
            }
        }
        System.out.println("Average of the numbers: "+(1.0*sumOfNumbers/countNumber));
    }
}
