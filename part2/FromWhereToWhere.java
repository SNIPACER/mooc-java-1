/*
Write a program which prints the integers, ask the user for the starting point
to a number given by the user.

Where to? 8
Where from? 5
5
6
7
8

If the upper limit is smaller than the starting point, nothing is printed:
Where to? 12
Where from? 16


*/

import java.util.Scanner;
 
public class FromWhereToWhere {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        // Write your program here
        System.out.print("Where to? ");
        int end=Integer.valueOf(scanner.nextLine());
        System.out.print("Where from? ");
        int begin=Integer.valueOf(scanner.nextLine());
        for(int i=begin;i<=end;i++){
            System.out.println(i);
        }
    }
}
