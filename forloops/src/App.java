import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);

        int countdown;

        System.out.print("Enter the number of times the countdown from: ");
        countdown = scanner.nextInt();

        for(int i = countdown; i >= 0; i--){
                System.out.println(i);
                Thread.sleep(1000);
        }

        System.out.println("HAPPY NEW YEAR!");

        scanner.close();
    }
}
