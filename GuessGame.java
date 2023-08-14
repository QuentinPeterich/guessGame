import java.util.Scanner;

public class GuessGame {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    // create a random secret number
    // Math.random() this is a random number between 0 (invlusive) and 1 (exclusive) - [0.1]
    // 100*Math.random() - [0,100]
    // (int)(100*Math.random()) - (0, 1, 2, 3, ... 99)
    // (int)(100*Math.random()) + 1 -> (1, 2, 3, 4, .....100)
    
    int secret = (int)(100 * Math.random()); // generate a random number between 1 and 100

    // ask the user to enter a guess
    System.out.println("Please guess my number between 1 and 100");

    // read users input
    int userGuess = input.nextInt();
    
    while(userGuess != secret) // as lomng as userGuess is wrong 
    {
      // give feedback
      // System.out.println("Your guess was wrong.");
      if(userGuess > secret){
        System.out.println("It was too high, guess again.");
      }
      else {
        System.out.println("It was too low, guess again.");
      }
      // ask to guess again
      // System.out.println("Guess again");
      // read users input
      userGuess = input.nextInt();

    }
    // when do you get out of the while loop
   System.out.println("Congrats!, You guessed it."); // you only get here if userGuess == secret

    input.close();
  }
  
}
