
package numberguessinggame;
//import static java.lang.Math.floor;
import java.util.Scanner;

public class NumberGuessingGame {

// Function that implements the  number guessing game
	 
public static void guessANumber()
{
		
Scanner sc = new Scanner(System.in);

// Generate the numbers
 int number = 1 + (int)(100* Math.random()); 

// Given z trials
int z = 5;

int i, guess;

System.out.println("Hello Gamer 😊. Welcome to the Number Guessing Game 🤗.I am Kendi Leila your host.");
    System.out.println("Have Fun😏!");
System.out.println( "A number is chosen" + " between 1 to 100." + "Guess the number"+ " within 5 trials.");

// Iterate over K Trials
for (i = 0; i < z; i++) {

System.out.println( "Guess the number:");

// Take input for guessing
guess = sc.nextInt();

// If the number is guessed
if (number == guess) {
    System.out.println( "Congratulations!🎉🎉🎊" + " You guessed the number 😍😍.");
    System.out.println("Follow for more @Kendi.com");
    break;
}
else if (number > guess && i != z - 1) {
    System.out.println("The number is " + "greater than " + guess);
}
else if (number < guess && i != z - 1) {
    System.out.println("The number is"+ " less than " + guess);
}
}
if (i == z) {
    System.out.println("You have exhausted"+ " z trials.");

    System.out.println("The number was " + number);
    System.out.println("Thankyou for participating in my game.");
    System.out.println("Sure you gotta be lucky next time😪😂");
	}
	}

// Driver Code
public static void main(String arg[])
{

guessANumber();
}
}

