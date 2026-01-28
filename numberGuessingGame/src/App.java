import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        // NUMBER GUESSING GAME (Form 1 - 100)
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        // decalare variable
        int randNum = 0;
        int guessNum = 0;
        int attempts = 0;
        int min;
        int max;
        
        System.out.println("Welcome to Number Guessing Game");
        System.out.println("Enter the range of number you want to gues");
        
        System.out.print("Enter the low number: ");
        min = scanner.nextInt();

        System.out.print("Enter the High number: ");
        max = scanner.nextInt();

        randNum = random.nextInt(min, max + 1);
        System.out.printf("Guess a Number between %d - %d\n", min, max);

        // user guess the number (Wrong gues? loop)
        do {
            attempts++;
            System.out.print("Enter a guess: ");
            guessNum = scanner.nextInt();

            if (guessNum < randNum) {
                System.out.println("Too low, try again");
            }

            else if (guessNum > randNum){
                System.out.println("Too High, try again");
            } 

        } while (randNum != guessNum);

        // user guess the correct number
        System.out.printf("You have guessed the correct number %d on %d attempts\n", randNum, attempts);

        scanner.close();

    }
}
