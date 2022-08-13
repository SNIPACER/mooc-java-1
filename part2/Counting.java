/*
Write a program that reads an integer from the user. Next, the program prints
numbers from 0 to the number given by the user. You can assume that the user 
always gives a positive number. Below are some examples of the expected functionality.

output:-
--------------
4
0
1
2
3
4

1
0
1

*/

import java.util.Scanner;
 
public class Counting {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int number=Integer.valueOf(scanner.nextLine());
        for(int i=0;i<=number;i++){
            System.out.println(i);
        }
        
    }
}
