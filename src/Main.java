import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int randomNumber;
        int playerGuess = 0;
        String trash = "";

        //Input in meters
        System.out.print("Enter your guess between one and ten: ");
        if(in.hasNextInt())
        {
            // OK safe to read in a double
            playerGuess = in.nextInt();
            in.nextLine(); // clears the newline from the buffer
        }
        else
        {
            // Not a double can’t use nextDouble() read as String with nextLine() instead
            trash = in.nextLine();
            System.out.println("\nYou said your guess was: " + trash);
            System.out.println("Run the program again and enter a valid amount!");
            System.exit(0);  // terminate the program
        }

        //Random number generator

        Random random = new Random();

        randomNumber = random.nextInt(1 + 10) + 1;
        //Calculation of if the user is low high or on the money
        if (randomNumber > playerGuess)
        {
            System.out.println("Your guess of " + playerGuess + " was too low the correct number was " + randomNumber);
        }
        else if (randomNumber < playerGuess) {
            System.out.println("Your guess of " + playerGuess + " was too high the correct number was " + randomNumber);
        }
        else
        {
            System.out.println("Your guess of " + playerGuess + " was on the money the correct number was " + randomNumber);
        }



    }
}