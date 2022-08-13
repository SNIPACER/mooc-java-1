/*
https://www.vero.fi/en/individuals/property/gifts/: A gift is a transfer of property 
to another person against no compensation or payment. If the total value of the gifts 
you receive from the same donor in the course of 3 years is €5,000 or more, you must 
pay gift tax.

When a gift is given by a close relative or a family member, the amount of gift tax 
is determined by the following table (source vero.fi):

Value of gift	         Tax at the lower limit	        Tax rate(%) for exceeding part
5000 — 25000	                100                         	8
25000 — 55000	                1700	                        10
55000 — 200000	              4700                         	12
200000 — 1000000	            22100	                        15
1000000 —	                    142100                        17


For example 6000€ gift implies 180€ of gift tax (100 + (6000-5000) * 0.08), and 
75000€ gift implies 7100€ of gift tax (4700 + (75000-55000) * 0.12).

Write a program that calculates the gift tax for a gift from a close relative or a 
family member. This is how the program should work:

output:-
----------
Value of the gift?
3500
No tax!

Value of the gift?
5000
Tax: 100.0

Value of the gift?
27500
Tax: 1950.0
*/
import java.util.Scanner;
 
public class GiftTax {
 
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Value of the gift?");
        double amount=Double.valueOf(scan.nextLine());
        if(amount>=5000 && amount<=25000){
            System.out.println("Tax: "+(100+(amount-5000) * 0.08));
        } else if(amount>=25000 && amount<=55000){
            System.out.println("Tax: "+(1700+(amount-25000) * 0.10));
        } else if(amount>=55000 && amount<=200000){
            System.out.println("Tax: "+(4700+(amount-55000) * 0.12));
        } else if(amount>=200000 && amount<=1000000){
            System.out.println("Tax: "+(22100+(amount-200000) * 0.15));
        } else if(amount>=1000000){
            System.out.println("Tax: "+(142100+(amount-1000000) * 0.17));
        } else{
            System.out.println("No tax!");
        }
    }
}

