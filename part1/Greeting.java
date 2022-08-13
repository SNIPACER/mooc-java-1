/*
Write a program that prompts the user for their name with the message "What's your name?".
When the user has written their name, the program has to print "Hi " followed by the user's name.

The exercise template already includes the code that creates the Scanner tool.

import java.util.Scanner;

public class Greeting {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
    }
}

Example output when user gives the name Ada.
What's your name?
Ada
Hi Ada

Example output when user gives the name Lily.
What's your name?
Lily
Hi Lily

*/

import java.util.Scanner;

public class Greeting {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("What's your name?");
        String message=scanner.nextLine();
        System.out.println("Hi "+message);

    }
}

