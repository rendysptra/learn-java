import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);

        int number = 0;

        do {
            System.out.print("Enter a number between 1 - 10:");
            number = scanner.nextInt();
        }while(number < 1 || number > 10);

        System.out.printf("You picked %d\n", number);

        scanner.close();
        
    }
}
