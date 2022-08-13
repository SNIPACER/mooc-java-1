/*
Create the following method in the exercise template: public static void 
printUntilNumber(int number). It should print the numbers from one to the
number passed as a parameter. Two examples of the method's usage are given below.

public static void main(String[] args) {
    printUntilNumber(5);
}

output:-
---------
1
2
3
4
5


*/

import java.util.Scanner;
 
public class FromOneToParameter {
 
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int value=Integer.valueOf(scan.nextLine());
        printUntilNumber(value);
    }
    public static void printUntilNumber(int number){
        int x=1;
        while(x<=number){
            System.out.println(x);
            x++;
        }
    }
}
