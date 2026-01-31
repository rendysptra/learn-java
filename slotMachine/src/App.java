import java.util.Random;
import java.util.Scanner;

public class App {
    
    static Random random = new Random();

    static boolean isValidSpin;
    static String[] spinSymbols;
    static int sameSymbols;
    static double payout;

    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);
        
        // declare variable
        double balance = 100;
        double bet;
        String[] symbols = {"🍇", "🍍", "🥭", "🐻", "🦅", "🐬"};
        int spinAmount;
        String playAgain = "yes";

        // display welcome message
        welcomeMessage(balance);
        
        do {
            // play if balance > 0
            if (balance <= 0) {
                System.out.println("Please deposit to Slot Machine to continue playing!");
                break;
            }

            do {
                // enter bet amount
                System.out.print("Enter amount of bet $ ");
                bet = scanner.nextDouble();
    
                System.out.print("Enter amunt of spin/s : ");
                spinAmount = scanner.nextInt();
                scanner.nextLine();
    
                isValidSpin = spinValidation(balance, bet, spinAmount);
                
            } while (!isValidSpin);
            
            // spin slot
            for (int i = 0; i < spinAmount; i++) {
                // balance -= bet
                balance -= bet;
                sameSymbols = 0;
                payout = 0;

                // spin row
                spinSymbols = spinRow(symbols);
                
                // check win condition
                sameSymbols = checkWinCondition(spinSymbols);
                
                // print row
                printRow(spinSymbols);
                
                // get payout
                payout = getPayout(sameSymbols, bet);
                balance += payout;

                System.out.printf("\n       Balance: $%,.2f      \n", balance);
                
                if (spinAmount > 1) {
                    Thread.sleep(1000);
                }
            }

            // ask to play again
            System.out.print("You want to spin again? (yes/no): ");
            playAgain = scanner.nextLine();

        } while (!playAgain.equalsIgnoreCase("no"));


        // goodbye message
        System.out.println("Thank you for playing!");

        scanner.close();

    }

    static void welcomeMessage(double balance){
        System.out.println("===========================");
        System.out.println("     SLOT MACHINE 3000     ");
        System.out.println("Symbols: 🍇 🍍 🥭 🐻 🦅 🐬 ");
        System.out.println("===========================");
        System.out.printf("Current balance: $%,.2f\n", balance);
    }
    
    static boolean spinValidation(double balance, double bet, int spinAmount){
        
        isValidSpin = true;

        //  verify if bet <= balance
        if (bet * spinAmount > balance) {
            System.out.println("Invalid bet amount, insufficient balance!");
            isValidSpin = false;
        }
        
        //  verify if bet > 0
        else if (bet <= 0 || spinAmount <= 0) {
            System.out.println("Invalid bet/spin amount!");
            isValidSpin = false;
        }

        return isValidSpin;
   
    }

    static String[] spinRow(String[] symbols){

        spinSymbols = new String[3];

        for (int i = 0; i < 3; i++) {
            spinSymbols[i] = symbols[random.nextInt(0, 6)];
        }

        return spinSymbols;

    }

    static int checkWinCondition(String[] spinSymbols){
        
        sameSymbols = 0;
        
        for (int k = 0; k < spinSymbols.length; k++) {
            for (int l = k + 1; l < spinSymbols.length; l++) {
                if (spinSymbols[k] == spinSymbols[l]) {
                    sameSymbols++;
                }
            }
        }

        return sameSymbols;
        
    }

    static void printRow(String[] spinSymbols){
        System.out.println("===========================");
        System.out.println("     SLOT MACHINE 3000     ");
        System.out.println();
        System.out.print("\n    " + String.join("   |   ", spinSymbols));
        System.out.println();
        System.out.println("===========================");
    }

    static double getPayout(int sameSymbols, double bet){
        
        payout = 0;
        
        if (sameSymbols == 3) {
            payout = bet * 10;
            System.out.println("Congrats you have hit jackpot!");
            System.out.printf("       You win $%,.2f!     \n", payout);
        } 
        
        else if (sameSymbols == 1) {
            payout = bet * 2;
            System.out.printf("       You win $%,.2f!     \n", payout);
        }

        return payout;
        
    }
    
}
