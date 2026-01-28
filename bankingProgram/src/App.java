import java.util.Scanner;

public class App {

    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        
        // BANKING PROGRAM
        
        // declare variables
        double balance = 0;
        char choose = '0';

        do {
            // Welcome
            System.out.println("$$$$$$$$$$$$$$$$$$$$$");
            System.out.println("$$ BANKING PROGRAM $$");
            System.out.println("$$$$$$$$$$$$$$$$$$$$$");
            System.out.println("$ 1. Show balance");
            System.out.println("$ 2. Deposit");
            System.out.println("$ 3. Withdraw");
            System.out.println("$ 4. exit");
            System.out.println("$$$$$$$$$$$$$$$$$$$$$");
            System.out.print("Choose option (1-4): ");
            choose = scanner.next().charAt(0);

            // Operations (Show balance, deposit, withdraw, exit)

            switch (choose) {
                case '1' -> showBalance(balance);
                case '2' -> balance += deposit();
                case '3' -> balance -= withdraw(balance);
                case '4' -> System.out.println("Thank you for using this bank!");
                default -> System.out.println("Invalid Option!");
            }
        } while (choose != '4');
        

        scanner.close();

    }

    static void showBalance(double balance){
        System.out.printf("Your total balance now is $%,.2f\n", balance);
    }

    static double deposit(){
        double amount;

        System.out.print("Enter amount you want to deposit: ");
        amount = scanner.nextDouble();

        if (amount <= 0) {
            System.out.println("Invalid amount!");
            return 0;
        }
        else{
            return amount;
        }
    }

    static double withdraw(double balance){
        double amount;

        System.out.print("Enter amount you want to withdraw: ");
        amount = scanner.nextDouble();

        if (amount > balance) {
            System.out.println("Insufficient balance!");
            return 0;
        }
        else if (amount <= 0) {
            System.out.println("Invalid amount!");
            return 0;
        }
        else{
            return amount;
        }
    }

    
}
