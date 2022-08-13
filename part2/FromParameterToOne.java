/*
Create the following method in the exercise template: public static void 
printFromNumberToOne(int number). It should print the numbers from the
number passed as a parameter down to one. Two examples of the method's 
usage are given below.


public static void main(String[] args) {
    printFromNumberToOne(5);
}


output:-
-------------
5
4
3
2
1


public static void main(String[] args) {
    printFromNumberToOne(2);
}

output:-
-------------
2
1

*/

import java.util.Scanner;
 
public class FromParameterToOne {
 
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int value = Integer.valueOf(scan.nextLine());
        printFromNumberToOne(value);
 
    }
 
    public static void printFromNumberToOne(int number) {
        int x=1;
        while (number>=x) {
            System.out.println(number);
            number--;
        }
    }
 
}

