/*
Write a program that prompts the user for two integers and prints the larger of the two.
If the numbers are the same, then the program informs us about this as well.

Sample outputs:
----------------
Give the first number:
5
Give the second number:
3
Greater number is: 5


Give the first number:
5
Give the second number:
8
Greater number is: 8


Give the first number:
5
Give the second number:
5
The numbers are equal!
*/
import java.util.Scanner;
 
public class LargerThanOrEqualTo {
 
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give the first number:");
        int first=Integer.valueOf(scan.nextLine());
        System.out.println("Give the second number");
        int second=Integer.valueOf(scan.nextLine());
        if(first>second){
            System.out.println("Greater number is: "+first);
        } else if(second>first) {
            System.out.println("Greater number is: "+second);
        } else {
            System.out.println("The numbers are equal!");
        }
    }
}
