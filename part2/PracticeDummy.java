/*

The output of the program can be as follows:
--------------------------------------------
Input a number, 0 to quit
5
You input 5
Input a number, 0 to quit
-2
You input -2
Input a number, 0 to quit
0
Done, thank you!
*/

import java.util.Scanner;

public class PracticeDummy{
  
  public static void main(String[] args){
  
    Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Input a number, 0 to quit");
             int command = Integer.valueOf(scanner.nextLine());
             if (command == 0) {
                break;
             }

             System.out.println("You input " + command);
        }

      System.out.println("Done, thank you!");
  }
  
}
