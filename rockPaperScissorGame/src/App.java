import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        // declare variable
        String[] choices = {"rock", "paper", "scissor"};
        String userChoice;
        String computerChoice;
        String playAgain = "yes";
        

        do {
            // get choice from user
            System.out.print("Enter your move (rock/paper/scissor): ");
            userChoice = scanner.nextLine().toLowerCase();

            if (!userChoice.equals(choices[0]) && !userChoice.equals(choices[1]) && !userChoice.equals(choices[2])) {
                System.out.println("Invalid move, try again!");
                continue;
            }
            
            // get random choice for the computer
            computerChoice = choices[random.nextInt(0, 3)];
            System.out.printf("Computer move: %s\n", computerChoice);
            
            // check win condition
            if (userChoice.equals(computerChoice)) {
                System.out.println("Draw!");
            }
            else if (checkWinCondition(userChoice, computerChoice)) {
                System.out.println("You won!");
            }
            else{
                System.out.println("You lose!");
            }
            
            // ask to play again
            System.out.print("You want to play again? (yes/no): ");
            playAgain = scanner.nextLine().toLowerCase();

        } while (!playAgain.equalsIgnoreCase("no"));
        
        // goodbye message
        System.out.println("Goodbye, thank you for playing!");
        
        scanner.close();

    }

    static boolean checkWinCondition(String userChoice, String computerChoice){
        if (userChoice.equals("rock")) {
            if (computerChoice.equals("paper")) {
                return false;
            }
            else{
                return true;
            }
        }
        else if (userChoice.equals("paper")) {
            if (computerChoice.equals("scissor")) {
                return false;
            }
            else{
                return true;
            }
        }
        else if (userChoice.equals("scissor")) {
            if (computerChoice.equals("rock")) {
                return false;
            }
            else{
                return true;
            }
        }
        else{
            return false;
        }

    }
}
