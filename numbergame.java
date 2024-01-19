import java.util.Random;
import java.util.Scanner;
public class numbergame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();

        System.out.println("Welcome to Guess the number game!");

        while (true) {
            int guessNumber = rd.nextInt(100) + 1;

            int noOfAttempts = 9;
            int attemptTaken = 0;

            while (true) {
                System.out.println("Enter your guess number from 1 to 100: ");
                int userGuessNo = sc.nextInt();

                attemptTaken++;
                if(userGuessNo == guessNumber){
                    System.out.println("Congratulations you guessed the number!!! " + guessNumber + " in " + attemptTaken +" attempts!");
                    break;
                }
                else if(userGuessNo < guessNumber){
                    System.err.println("number guessed is too Low! Try again");
                }
                else{
                    System.out.println("number guessed is too High! Try again");
                }

                if(noOfAttempts == attemptTaken){
                    System.out.println("Sorry, The limit has been crossed! The correct number is: "+ guessNumber);
                    break;
                }
            }

            System.out.println("Do you want to play again? (y/n): ");
            String playAgain = sc.next();
            if(!playAgain.equalsIgnoreCase("y")){
                break;
            }

        }
    }
}