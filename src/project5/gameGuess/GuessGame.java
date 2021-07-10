package project5.gameGuess;

import java.util.Scanner;

public class GuessGame {

  /*
        Create a non-static method whose name is letsGuess().
        This method takes an int as a parameter, say secretNumber.
        Return type is void.

        In this method you must continue to guess number(s) until the you hit the correct number which is secretNumber.
        Method prints "Guess a number between 0 and 100: " in the beginning of the game.
        When the guess number is less than the secretNumber then print "Your number is small. Try a bigger number.".
        When the guess number is more than the secretNumber then print "Your number is big. Try a smaller number.".
        When the guess number is equal to the secretNumber than print "You won. Congrats!". And stop execution.

        The maximum number of guess attempts is 5.
        If the guesses reach to 5 than print "You lost! Better chance next time". And stop execution.

        Note:
         1) For guessing a number Scanner class is used.
         2) The method is not a static method.
     */


    public void letsGuess(int secretNumber) {
        System.out.println("Guess a number between 0 and 100: ");
        Scanner scanner = new Scanner(System.in);

        int attempt = 0;

        for (int i = 0; i < 5; i++) {
            attempt++;

            int myNumber = scanner.nextInt();
            if (myNumber == secretNumber) {
                System.out.println("You won. Congrats!");

            } else if (myNumber < secretNumber) {
                System.out.println("Your number is small. Try a bigger number.");

            } else {
                System.out.println("Your number is big. Try a smaller number.");

            }
            if (attempt == 5) {
                System.out.println("You lost! Better chance next time");
            }
        }

    }
}