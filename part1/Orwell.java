/*
Write a program that prompts the user for an integer and prints the string "Orwell"
if the number is exactly 1984.

Output:-
--------
Give a number:
1983

Give a number:
1984
Orwell

*/
import java.util.Scanner;
 
public class Orwell {
 
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
 
        // Write your program here
        System.out.println("Give a number:");
        int value=Integer.valueOf(scan.nextLine());
        if(value==1984){
            System.out.println("Orwell");
        }
    }
}
