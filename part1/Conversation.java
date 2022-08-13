/*
Write a program that works as follows:

output:-
Greetings! How are you doing?
Good thank you!
Oh, how interesting. Tell me more!
Well, there's really nothing to tell.
Thanks for sharing!

Greetings! How are you doing?
Nice and dandy like cotton candy!
Oh, how interesting. Tell me more!
Just went shopping.
Thanks for sharing!
*/



import java.util.Scanner;

public class Conversation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Greetings! How are you doing?");
        String message=scanner.nextLine();
        System.out.println("Oh, how interesting. Tell me more!");
        String message1=scanner.nextLine();
        System.out.println("Thanks for sharing!");

    }
}
