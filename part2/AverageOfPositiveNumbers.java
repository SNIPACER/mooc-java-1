/*
Write a program that asks the user for input until the user inputs 0. 
After this, the program prints the average of the positive numbers 
(numbers that are greater than zero).

If no positive number is inputted, the program prints "Cannot calculate the 
average"

Below a few examples of the programs output:
-------------------------------------------
3
5
1
-3
0
3.0

0
Cannot calculate the average

-3
1
0
1.0

1
1
0
1.0

*/

import java.util.Scanner;
 
public class AverageOfPositiveNumbers {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countNumber=0;
        int sumOfNumbers=0;
        while(true){
            int number=Integer.valueOf(scanner.nextLine());
            if(number==0){
                break;
            }
            if(number>0){
                countNumber=countNumber+1;
                sumOfNumbers=sumOfNumbers+number;
            }
        }
        if(countNumber==0){
            System.out.println("Cannot calculate the average");
        } else{
            System.out.println("Average of the numbers: "+(1.0*sumOfNumbers/countNumber));
        }
    }
}
