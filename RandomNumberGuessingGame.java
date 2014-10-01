package randomnumberguessinggame;

/**
 * AWT Sample application
 *
 * @author Eric Schenck
 * @version 1.00 10/01/2012
 */
import java.util.Random;
import java.util.Scanner;

public class RandomNumberGuessingGame {
    
    public static void main(String[] args) 
    {
     Random generator = new Random();
     
     Scanner keyboard = new Scanner(System.in);
     
     int randomInt = generator.nextInt(100);
     
     int userInput = -1, numberOfGuesses = 0;
     
     System.out.println("Attempt to guess a number which I have"
       + " randomly generated between one and 100");
     
     while (userInput != randomInt)
     {
      
       
       userInput = keyboard.nextInt();
       
       if (userInput > randomInt)
       {
        System.out.println("guess lower");
       
        numberOfGuesses++;
       }
       else if (userInput < randomInt)
       {
        System.out.println("Guess higher");
        
        numberOfGuesses++;
       }
       else
       {
        numberOfGuesses++;
        
       }
     }
     
     System.out.println("you guessed correctly!\nThe number was " 
      + randomInt + "\nAnd it only took " + numberOfGuesses 
      + " Guess(es)");
    
     
        
    }
}
