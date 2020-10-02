import java.util.Scanner;
import java.util.Random;
/**
 * make a guessing game, where a random # is chosen, then the user guesses and the program tells them if it's lower or highe than the chosen # until it is guessed
 * @author Graham Ellacott
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // Create a scanner to get user input
    Scanner input = new Scanner(System.in);

    //Create a random number generator
    Random rand = new Random();
    //choose a random number
    int randomNumber = rand.nextInt(100) + 1;

    //the variable to store the user's guess
    int guess;

    //start the guessing loop
    do{
      //ask user for guess
      System.out.println("Please enter your guess between 1 and 100");
      guess = input.nextInt();

      if(guess == randomNumber){ //check if number is correct
        System.out.println("You are correct! Good job!");
      }else if(guess < randomNumber){ //if the guess is less than the random number
        System.out.println("You are too low. Try again.!"); //tell the user it's too low
      }else{ //if the guess is more than the random number
        System.out.println("You are too high. Try again.!"); //tell the user it's too high
      }
    }while(guess != randomNumber); //if the guess is incorrect, repeat
  }
}
