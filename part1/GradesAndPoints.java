/*
The table below describes how the grade for a particular course is determined. 
Write a program that gives a course grade according to the provided table.


points	   grade
< 0	        impossible!
0-49	      failed
50-59	      1
60-69	      2
70-79	      3
80-89	      4
90-100	    5
> 100	      incredible!

Sample outputs:
-------------------
Give points [0-100]:
37
Grade: failed

Give points [0-100]:
76
Grade: 3

Give points [0-100]:
95
Grade: 5

Give points [0-100]:
-3
Grade: impossible!
*/
import java.util.Scanner;
 
public class GradesAndPoints {
 
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give points [0-100]:");
        int number=Integer.valueOf(scan.nextLine());
        if(number<0){
            System.out.println("impossible!");
        } else if(number<=49){
            System.out.println("failed");
        } else if(number<=59){
            System.out.println("1");
        } else if(number<=69){
            System.out.println("2");
        } else if(number<=79){
            System.out.println("3");
        } else if(number<=89){
            System.out.println("4");
        } else if(number<=100){
            System.out.println("5");
        } else if(number>100){
            System.out.println("incredible!");
        }
 
    }
}

