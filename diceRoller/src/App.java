import java.util.Random;
import java.util.Scanner;

public class App {
    
    static Random random = new Random();
    static Scanner scanner = new Scanner(System.in);
    
    static final String[][][] faceconfig = {
        {{" ", " ", " "}, {" ", "o", " "}, {" ", " ", " "}}, // 1
        {{"o", " ", " "}, {" ", " ", " "}, {" ", " ", "o"}}, // 2
        {{"o", " ", " "}, {" ", "o", " "}, {" ", " ", "o"}}, // 3
        {{"o", " ", "o"}, {" ", " ", " "}, {"o", " ", "o"}}, // 4
        {{"o", " ", "o"}, {" ", "o", " "}, {"o", " ", "o"}}, // 5
        {{"o", "o", "o"}, {" ", " ", " "}, {"o", "o", "o"}}, // 6
    };
    public static void main(String[] args) throws Exception {
        // JAVA DICE ROLLER PROGRAM

        // declare variables
        int numOfDice;
        int total = 0;

        // get the # of dice from the user
        System.out.print("Enter the # of dice to roll: ");
        numOfDice = scanner.nextInt();

        // check if the # of dice is > 0
        if (numOfDice > 0) {
            // roll all the dice
            total = diceRoll(numOfDice);
            // get the total
            System.out.printf("Total rolled: %d\n", total);
        }
        else{
            System.out.println("Invalid amount of dice!");
        }
        
    }

    static void drawDice(int num){
        System.out.println("-----");
        for(int i = 0; i < 3; i++){
            System.out.print("|");

            for(int j = 0; j < 3; j++){
                System.out.print(faceconfig[num - 1][j][i]);
            }

            System.out.println("|");
        }
        System.out.println("-----");
    }

    static int diceRoll(int dice){
        
        int randomDie;
        int total = 0;

        for(int i = 0; i < dice; i++){
            randomDie = random.nextInt(1, 7);
            drawDice(randomDie);
            System.out.printf("You Rolled: %d\n", randomDie);
            total += randomDie;
        }

        return total;
    }
}
